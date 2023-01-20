package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractPageStepDefinition {
	
	protected WebDriver driver; 
	protected WebDriver getDriver()
	{
		if ( driver == null)
		{
			System.setProperty("webdriver.crome.driver","C:/Users/amrim/eclipse_Selenium/DemoCucumberProject/src/test/resources/driver/chromedriver.exe");
			driver = new ChromeDriver();
		
	}
		return driver ; 	
	}
	

}
