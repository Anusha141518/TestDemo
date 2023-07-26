package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchButton {
	
	
	@Given("user navigates to the google page")
	public void user_navigates_to_the_google_page() {
	   System.out.println("Inside - step: user navigated to the google page");
	   
	}

	@When("user wants to search for Automation testing")
	public void user_wants_to_search_for_automation_testing() {
	    System.out.println("Inside - step: user wants to search for automation testing");
	   
	}

	@And("Click on search button")
	public void click_on_search_button() {
		System.out.println("Inside - step: click on search button");
	   
	}

	@Then("user is able see the content of automation testing")
	public void user_is_able_see_the_content_of_automation_testing() {
		System.out.println("Inside - step: user is able to see the content of automation testing");
	    
	}


}
