package pages;

import com.microsoft.playwright.Page;

public class HomePage {
	private final Page page;
	
	
	private final String timeLink="oxd-main-menu-item active";
	
	//constructor
	public HomePage (Page page) {
		this.page=page;
		
	}
	public void clickTimeLink() {
//		page.click (timeLink);
		page.locator(timeLink).click();
	}
}
