package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC002_SceOutLineStepDef {
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	   System.out.println("Home page");
	}
	@When("User clicks on Sign in Link")
	public void user_clicks_on_sign_in_link() {
	    System.out.println("Click on Sign in..");
	}
	@Then("User sees Login Page")
	public void user_sees_login_page() {
	   System.out.println("Validate Login page..");
	}
	@When("User enters {string} and {string} clicks on Submit")
	public void user_enters_and_clicks_on_submit(String string, String string2) {
	   System.out.println(string+"\t"+string2);
	}
	@Then("User sees User Account")
	public void user_sees_user_account() {
	    System.out.println("Validate user - display message");
	}

}
