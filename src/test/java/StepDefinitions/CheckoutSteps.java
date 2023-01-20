package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {
	
	/*WebDriver driver = null ;
	@Given("User is logged in")
	public void user_is_logged_in() throws InterruptedException {
		System.out.println("Inside step User is on login page");
		System.setProperty("webdriver.crome.driver","C:/Users/amrim/eclipse_Selenium/DemoCucumberProject/src/test/resources/driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.navigate().to("https://www.saucedemo.com");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		Thread.sleep(2000);
	    
	}

	 @When("user adds item to the cart")
	public void user_adds_item_to_the_cart() {
		 System.out.println("Inside user adds item to the cart ");
		 driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		 
	   
	}

	@And("user clicks the cart")
	public void user_clicks_the_cart() {
		System.out.println("Inside user clicks the cart");
	   driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	}

	@And("user clicks on checkout")
	public void user_clicks_on_checkout() {
		 System.out.println("Inside:  user clicks on checkout ");
		 driver.findElement(By.name("checkout")).click();
		
	    
	}

	@And("User enters first name last name and zip code")
	public void user_enters_first_name_last_name_and_zip_code() throws InterruptedException {
		System.out.println("Inside : User enters first name last name and zip code ");
		driver.findElement(By.name("firstName")).sendKeys("test");
		driver.findElement(By.name("lastName")).sendKeys("test");
		driver.findElement(By.name("postalCode")).sendKeys("12345");
		Thread.sleep(2000);
		
	    
	}

	@And("user clicks on continue")
	public void user_clicks_on_continue() {
		System.out.println("Inside : user clicks on continue");
		driver.findElement(By.name("continue")).click();
	}

	@And("user clicks on finish")
	public void user_clicks_on_finish() throws InterruptedException {
		
		System.out.println("Inside :user clicks on finish");
		driver.findElement(By.name("finish")).click();
		Thread.sleep(2000);
	    
	}

	@Then("User validates order page")
	public void user_validates_order_page() throws InterruptedException {
		
		System.out.println("Inside :User validates order page");
		driver.getPageSource().contains("THANK YOU FOR YOUR ORDER");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
		
	    
	}*/

}
