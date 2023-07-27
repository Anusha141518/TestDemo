package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.GooglePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {	
	
	WebDriver driver;
	String ProjectPath=System.getProperty("user.dir");
	GooglePage GP;
	
	
	@Given("browser is open")
	public void browser_is_open() {
	    System.setProperty("Webdriver.chrome.driver", ProjectPath+"/src/test/resources/Drivers/chromedriver.exe");
	   driver=new ChromeDriver();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	   
	  // driver.manage().window().maximize();
	   
	
	}

	@And("user is google search page")
	public void user_is_google_search_page() {
		System.out.println("Insider Step - user is google search page navigation");
		driver.get("https://www.google.com/");
	}
	
	@When("^user enters a (.*) in search box$")
	public void user_enters_a_images_in_search_box(String txt) {
		GP=new GooglePage(driver);
		GP.enterTxt(txt);
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Insider Step - hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Insider Step - user is navigated to search results");
		System.out.println("testt- images added");
		driver.getPageSource().contains("Google Images selected");
		
		driver.close();
		driver.quit();
	}

}
