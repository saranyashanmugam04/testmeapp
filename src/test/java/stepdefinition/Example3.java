package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example3 {
	WebDriver driver;
	
	@Given("user navigates to TestMe applicaton")
	public void user_navigates_to_TestMe_applicaton() {
		System.out.println("user launched chorme and naviagtes to TestMeApp");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranya.a.shanmugam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
	}

	@When("user enter username and passowrd")
	public void user_enter_username_and_passowrd() {
		LoginPageObjects lp=new LoginPageObjects(driver);
		lp.un.sendKeys("mercury");
		LoginPageObjects.psd.sendKeys("mercury");
	}

	@Then("perform login")
	public void perform_login() {
		LoginPageObjects lp=new LoginPageObjects(driver);
		LoginPageObjects.ok.click();

	}

}
