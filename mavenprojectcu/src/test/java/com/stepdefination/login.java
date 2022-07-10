package com.stepdefination;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.pages.loginpage2;
import com.abc.utility.BrowserLaunch;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login  {
	 public static WebDriver driver;
	 static boolean flag=false;
	@Given("browser should open with respective URL")
	
	public void browser_should_open_with_respective_url() {
		BrowserLaunch obj=new BrowserLaunch();
		if(!flag) {System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		flag=true;
		}
	}

	/*
	 * @When("Enter the Username") public void enter_the_username() {
	 * loginpage2.getusername().sendKeys("Admin123");
	 */
	 // driver.findElement(By.id("txtUsername")).sendKeys("Admin12");
	//}
		
		/*
		 * @When("Enter the Username {string}")// cucumber expression public void
		 * enter_the_username(String username) {
		 * //loginpage2.getusername().sendKeys("Admin123");
		 * 
		 * driver.findElement(By.id("txtUsername")).sendKeys(username); }
		 */
		 
		
		  @When("^Enter the Username \"([^\"]*)\"$") 
		  public void
		  enter_the_username(String username) { //
		 // loginpage2.getusername().sendKeys("Admin123");
		  
		  driver.findElement(By.id("txtUsername")).sendKeys(username); }
		 

	/*
	 * @When("Enter the password") public void enter_the_password() {
	 * loginpage2.getPassword().sendKeys("Admin");
	 * //driver.findElement(By.id("txtPassword")).sendKeys("Admin12"); }
	 */
	
	
	  @When("^Enter the password (.*)") public void enter_the_password(String
	  password) { // loginpage2.getPassword().sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys(password); }
	  
	 

		
	/*
	 * @When("Enter the password {string}") public void enter_the_password(String
	 * password) {
	 * 
	 * //loginpage2.getPassword().sendKeys("Admin12");
	 * driver.findElement(By.id("txtPassword")).sendKeys(password); }
	 */
	
	
	
	@When("click on login button")
	public void click_on_login_button() {
		//loginpage2.getLogin().click();
	  driver.findElement(By.id("btnLogin")).click();
	}

	@Then("then user should not be able to login")
	public void then_user_should_not_be_able_to_login() {
		
		if(!driver.getCurrentUrl().contains("dashboard")) {
		System.out.println("user is not able to login with invalid credential");
		}else {
			
			System.out.println("Test case fail- user is able to login invalid credentials ");
		}

}
}