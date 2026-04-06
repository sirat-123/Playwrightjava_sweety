package base;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import utils.ExtentManager;
import utils.ScreenShotUtil;

public class BaseTest {
	protected ExtentReports extent;
	protected ExtentTest test;
	
	protected Playwright playwright;
	protected Browser browser;
	protected Page page;
	//reports setup
	
	
	
	@BeforeMethod
	
	
	public void setUp(Method method) {
		//reports
		extent=ExtentManager.getInstance();
		test =extent.createTest(method.getName());
		
		//playwright setup
		playwright=Playwright.create();
		browser=playwright.chromium().launch(
				new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000)
				);
		page=browser.newPage();
		page.setDefaultTimeout(4000);
		
	}
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.fail(result.getThrowable());
			//adding the screen shots on the reports
			String screenshotPath=ScreenShotUtil.takeScreenshot(page,result.getName());
			test.addScreenCaptureFromBase64String(screenshotPath);
			
		}else if(result.getStatus()==ITestResult.SUCCESS) {
			test.pass("Test Passed");
			
			
		}else {
			test.skip("Test Skipped");
			
		}
		extent.flush();
		if(browser !=null) browser.close();
		if(playwright !=null) playwright.close();
		
	}
	

}
