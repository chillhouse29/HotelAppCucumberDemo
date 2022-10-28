package com.stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestSteps {
	WebDriver driver;
	public String ExpectedOutput="Hello vasuvespag!";

	@Given("User is on HotelApp homepage")
	public void user_is_on_hotel_app_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver102win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		System.out.println("Inside given Method");

	}
	@When("User enters Username")
	public void user_enters_username() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement uname=driver.findElement(By.id("username"));
		uname.clear();
		uname.sendKeys("vasuvespag");
		System.out.println("Inside username Method");

	}
	@When("User enters Password")
	public void user_enters_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("vasu1234");
		System.out.println("Inside password Method");
	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("login_button")).click();
		System.out.println("Inside login Method");
	}
//	@Then("Login is Successfull")
//	public void login_is_successfull() {
//	    // Write code here that turns the phrase above into concrete actions
//		 WebElement Greeting=driver.findElement(By.name("username_show"));
//	        String actualOutput=Greeting.getAttribute("value");
//	        Assert.assertEquals(ExpectedOutput, actualOutput);
//		System.out.println("Inside then Method");
//	}
	
	

	@When("User enters {string} and {string}")
	public void user_enters(String name, String pass) {
	    // Write code here that turns the phrase above into concrete actions
	  
	    WebElement uname=driver.findElement(By.id("username"));
		uname.clear();
		uname.sendKeys(name);
		
	    
	    driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pass);
		
	    
	}
	
	

	@Then("login is successfull")
	public void login_is_successfull() {
	    // Write code here that turns the phrase above into concrete actions
		 WebElement Greeting=driver.findElement(By.name("username_show"));
	        String actualOutput=Greeting.getAttribute("value");
	        //Assert.assertEquals(ExpectedOutput, actualOutput);
		System.out.println(actualOutput);
	}



//	@Then("login is successfull")
//	public void login_is_successfull() {
//	    // Write code here that turns the phrase above into concrete actions
//		WebElement Greeting=driver.findElement(By.name("username_show"));
//        String actualOutput=Greeting.getAttribute("value");
//        Assert.assertEquals(ExpectedOutput, actualOutput);
//	     System.out.println("login sucessfull");
//	}
	
	



	
	
//	@When("User selects location from the dropdown")
//	public void user_selects_location_from_the_dropdown() {
//		new Select(driver.findElement(By.cssSelector("#location"))).selectByIndex(1);
//	    // Write code here that turns the phrase above into concrete actions
//	}
//	@When("user clicks on search button")
//	public void user_clicks_on_search_button() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//*[@id=\"radiobutton_0\"]")).click();
//		
//	}
//	@Then("list of hotels is displayed")
//	public void list_of_hotels_is_displayed() {
//	    // Write code here that turns the phrase above into concrete actions
//	 
//	}
//	@When("User enters {string}")
//	public void user_enters(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("login is sucessfull")
//	public void login_is_sucessfull() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	
//	//////DataTableDemo////////
//	
//	/**
//	 * @param userCredentials
//	 */
//	@When("user enters username and password")
//	public void user_enters_username_and_password(io.cucumber.datatable.DataTable userCredentials) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//		
//		  List<List<String>> data=userCredentials.asLists(String.class); String
//		  userName=data.get(0).get(1); String password=data.get(0).get(1); WebElement
//		  uname=driver.findElement(By.id("username")); uname.clear();
//		  uname.sendKeys(userName);
//		  
//		  driver.findElement(By.name("password")).clear();
//		  driver.findElement(By.name("password")).sendKeys(password);
//		  System.out.println("Inside password Method");
//		 
//
//		List<Map<String,String>> data=userCredentials.asMaps(String.class,String.class);
//		for (Map<String,String> data1:data) {
//			String userName=data1.get("username");
//			String password=data1.get("password");
//		}

	}






/* outlineDemo//////////
 * @When("User enters Username as <{string}>")
public void user_enters_username_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User enters Password as <{string}>")
public void user_enters_password_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("login is successfull")
public void login_is_successfull() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
 */
