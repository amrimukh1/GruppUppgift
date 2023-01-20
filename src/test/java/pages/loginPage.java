package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import StepDefinitions.AbstractPageStepDefinition;

public class loginPage extends AbstractPageStepDefinition{
	
	WebDriver driver ;
	
	By txt_username= By.name("user-name");
	By txt_password = By.name("password");
	By txt_login = By.name("login-button"); 
	
	
	
	



     public loginPage(WebDriver driver2) {
		this.driver = driver2; 
	}







	public void enterCredentials(String username,String password)
	{
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		
	}
	
	public void clicklogin()
	{
	
	driver.findElement(txt_login).click();

	}
	
	public void navigateToHome()
	
	{
		
		driver.getPageSource().contains("SWAGLABS");
	}
}
	

