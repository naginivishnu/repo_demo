package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_VerifyLoginDef {
	WebDriver driver;
	@Given("user is on home page")
	public void user_is_on_home_page() {
	    System.out.println("Home Page");
	    driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	}
	@When("user clicks on Sign in link check next page title")
	public void user_clicks_on_sign_in_link_check_next_page_title() {
	    System.out.println("Click on Signin");
	    driver.findElement(By.linkText("Sign in")).click();
	    String title=driver.getTitle();
	    Assert.assertEquals(title, "Rediffmail");
	    
	}
	@When("user enters username and password clicks on Submit button")
	public void user_enters_username_and_password_clicks_on_submit_button() throws InterruptedException {
	    System.out.println("Enter user Name ,Password and click on Submit");
	    driver.findElement(By.id("login1")).sendKeys("m.arpana1234");
	    driver.findElement(By.id("password")).sendKeys("arpana123");
	    driver.findElement(By.id("remember")).click();
	    driver.findElement(By.name("proceed")).click();
	    Thread.sleep(5000);
	}
	@Then("validate user and display a Successful message")
	public void validate_user_and_display_a_successful_message() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/a[2]")).click();
		driver.quit();
	    System.out.println("Login Successful");
	   
	}
	@Then("Logout and close Application")
	public void logout_and_close_application() {
	   System.out.println("Logout..");
	
	}
	@When("user enters invalid username and valid password clicks on Submit button")
	public void user_enters_invalid_username_and_valid_password_clicks_on_submit_button() {

System.out.println("Enter invalid user name and valid password");
System.out.println("Click on Submit button");
	}
	@Then("validate for error message")
	public void validate_for_error_message() {
	    System.out.println("Error message is displayed");
	}
	@When("user enters valid username and invalid password clicks on submit button")
	public void user_enters_valid_username_and_invalid_password_clicks_on_submit_button() {
	   System.out.println("Enter valid user name and invalid password click on submit button");
	}

}
