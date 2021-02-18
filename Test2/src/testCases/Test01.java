package testCases;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.RegisterPage;
import test.BaseClass;

public class Test01 extends BaseClass{
	
	
	@Test
	public void testCase01() {
		RegisterPage page = PageFactory.initElements(driver, RegisterPage.class);
	//	PageFactory page = new PageFactory();
		page.initElements("driver, RegisterPage.driver");
		page.userName();
		page.password();
		page.email();
	}

}
