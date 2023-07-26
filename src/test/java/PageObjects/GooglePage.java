package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	
	WebDriver driver;
	
	@FindBy(xpath ="q")
	WebElement txtBox;
	
	public GooglePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(this.driver, GooglePage.this);
		
	}
	
	public void enterTxt(String txt)
	{
		System.out.println("inside enterTxt and text is ::: "+txt);
		driver.findElement(By.name("q")).sendKeys(txt);
		//txtBox.sendKeys(txt);
		
		
	}
	

	
}
