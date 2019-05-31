package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example1 {
	WebDriver driver;
	@Given("user launch chrome browser And enter TestMeApp URL")
	public void user_launch_chrome_browser_And_enter_TestMeApp_URL() {
		System.out.println("user launched chorme and naviagtes to TestMeApp");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranya.a.shanmugam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		
	}

	@When("user enter username in username field")
	public void user_enter_username_in_username_field() {
		System.out.println("username entered is displayed");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
	}

	@When("user enter password in password field")
	public void user_enter_password_in_password_field() {
		System.out.println("password entered is displayed");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");

	}

	@When("user clicks on OK button")
	public void user_clicks_on_OK_button() {
		System.out.println("clicked OK button");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

	}

	@Then("verify result")
	public void verify_result() {
		System.out.println("verified result");
		driver.close();
	}


}
