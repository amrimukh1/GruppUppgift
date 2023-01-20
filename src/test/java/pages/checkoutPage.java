package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutPage {
	
   WebDriver driver ;

	
	By btn_add_to_cart= By.name("add-to-cart-sauce-labs-backpack");
	By btn_cart = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	By btn_checkout = By.name("checkout");
	By txt_FirstName = By.name("firstName");
	By txt_Lastname = By.name("lastName");
	By txt_postcode = By.name("postalCode");	
	By btn_continue = By.name("continue");
	By btn_finish = By.name("finish");
	
	public checkoutPage(WebDriver driver2) {
		this.driver = driver2; 
	}

	public void addItem()
	
	{
		driver.findElement(btn_add_to_cart).click();
		
	}
	
	public void clickCart()
	
	{
		
		driver.findElement(btn_cart).click();
	}
	
	public void checkOut()
	
	{
		
		driver.findElement(btn_checkout).click();;
	}
	
	public void addInfo()
	
	{
		driver.findElement(txt_FirstName).sendKeys("test");
		driver.findElement(txt_Lastname).sendKeys("test");
		driver.findElement(txt_postcode).sendKeys("12345");
		
	}	
     
	public void clickContinue()
	{
		driver.findElement(btn_continue).click();
		
	}
	
	public void clickFinish()
	{
		driver.findElement(btn_finish).click();		
	}
	
	
	public void checkMsg() 
	{
		
		driver.getPageSource().contains("THANK YOU FOR YOUR ORDER");
		
	}
}
