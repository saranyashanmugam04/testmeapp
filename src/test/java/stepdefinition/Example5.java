package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example5 {

	WebDriver driver;

	@Given("user launching testmeapp")
	public void user_launching_testmeapp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranya.a.shanmugam\\Downloads\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost:8083/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enter username as {string} And enter password as {string}")
	public void user_enter_username_as_And_enter_password_as(String un, String psd) {
		LoginPageObjects lp=new LoginPageObjects(driver);
		lp.un.sendKeys(un);
	    lp.psd.sendKeys(psd);
	}

	@Then("click ok")
	public void click_ok() {
		LoginPageObjects lp=new LoginPageObjects(driver);
		lp.ok.click();
	    
	}

	@Then("verify login result")
	public void verify_login_result() {
		System.out.println("result is verified");
	}

}
