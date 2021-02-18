package test;


import org.testng.annotations.Test;

public class testCase01 extends BaseClass{
	
	@Test
	public void launchWebPage() {
	driver.get("https://in.yahoo.com");	
	System.out.println("Launch is Succsessful");
	
	
	}
	

}
