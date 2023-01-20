package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;

public class LoginDemoPOM extends AbstractPageStepDefinition{


	loginPage login;
    WebDriver driver = getDriver();
	
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside step User is on login page");
		
		
		
		driver.navigate().to("https://www.saucedemo.com");
	
			
	}
	
	@When("user enters username and password")
	public void user_enters_username_and_password()  {
		System.out.println("Inside steps User enters password and username");
		login = new loginPage(driver);
		login.enterCredentials("standard_user", "secret_sauce");
		
		//driver.findElement(By.name("user-name")).sendKeys("standard_user");
		//driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		
	}

	@And("clicks on login buttons")
	public void clicks_on_login_buttons() throws InterruptedException {
		System.out.println("Inside steps Press login ");
	
		login.clicklogin();
		//driver.findElement(By.name("login-button")).click();
		
		Thread.sleep(2000);
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		System.out.println("Inside step Home Page");
		
		login.navigateToHome();
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
