package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import test.BaseClass;
public class RegisterPage extends BaseClass{

	@FindBy(name="fld_username") WebElement UserNameTextBox;
	@FindBy(name="fld_email") WebElement Email;
	@FindBy(name="fld_password") WebElement Password;
	


	
	public void userName() {
	driver.findElement(By.name("fld_username")).sendKeys("Testing");
	}
	
	public void email() {
	driver.findElement(By.name("fld_email")).sendKeys("manikandan.28d@gmail.com");	
	}
	
	public void password() {
	driver.findElement(By.name("fld_password")).sendKeys("test");	
	}
	
	public void confirmPassword() {
		
	}
	
	public void dateOfBirth() {
		
	}
	
	public void phone() {
		
		
	}
	
	public void address() {
		
		
	}

	public void initElements(String string) {
		// TODO Auto-generated method stub
		
	}
}
