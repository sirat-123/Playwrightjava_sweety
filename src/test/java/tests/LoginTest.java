package tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends  BaseTest{
	@Test
	public void test() {
		LoginPage loginpage=new LoginPage(page);
		HomePage homepage=new HomePage(page);
		
		test.info("Navigating to login page");
		
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		test.info("adding user name");
		loginpage.addusername("Admin");
		test.info("adding password");
		loginpage.addPassword("admin123");
		test.info("click on login");
		loginpage.clickLoginButton();
		//for home page
		test.info("checking homePage");
		homepage.clickTimeLink();
		test.info("all step completed");
		

	}
	@Test
	public void test1() {
		test.skip("skipping this test");
		throw new SkipException("skipping this test");
		
		

	}
	@Test
	public void test3() {
		LoginPage loginpage=new LoginPage(page);
		HomePage homepage=new HomePage(page);
		
		test.info("Navigating to login page");
		
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		test.info("adding user name");
		loginpage.addusername("Admin");
		test.info("adding password");
		loginpage.addPassword("admin123");
		test.info("click on login");
		loginpage.clickLoginButton();
		//for home page
		test.info("checking homePage");
//		homepage.clickTimeLink();
		test.info("all step completed");
		

	}

}
