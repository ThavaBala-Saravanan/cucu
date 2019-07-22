package demo_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login {
	public static WebDriver driver; 
	@Given("want to Launch the Browser")
	public void want_to_Launch_the_Browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
	}

	@Given("want to enter the URL")
	public void want_to_enter_the_URL() {
		driver.get("http://192.168.40.4:8083/TestMeApp1"); 
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	    
	}
	
	@Then("Click on the Signin button")
	public void click_on_the_Signin_button() {
		driver.findElement(By.linkText("SignIn")).click();
	}

	@Then("Enter the username {string}")
	public void enter_the_username(String string) {
		driver.findElement(By.id("userName")).sendKeys(string);
	    
	}

	@Then("Enter the password {string}")
	public void enter_the_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	    	}

	@Then("Click on the login button")
	public void click_on_the_login_button() {
		 driver.findElement(By.name("Login")).click();
	    
	}

}
