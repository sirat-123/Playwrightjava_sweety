package tests;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import base.BaseTest;

public class LoginTest2 extends  BaseTest{
	@Test
	public void test() {
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).click();
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).click();
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).click();
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).fill("A");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).press("CapsLock");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).fill("Admin");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).click();
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("admin123");
	    page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
	    page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Time")).click();
//	    assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Recruitment"))).isVisible();
//	    page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Leave")).click();
//	    assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("PIM"))).isVisible();
//	    assertThat(page.getByLabel("Sidepanel").getByRole(AriaRole.LIST)).containsText("Admin");
	}

}
