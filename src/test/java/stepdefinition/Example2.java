package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example2 {
	@Given("user login")
	public void user_login() {
	 
		System.out.println("user performed login");
	}

	@When("user selects product using category")
	public void user_selects_product_using_category() {
		System.out.println("user selected category");
	}

	@Then("verify the list of products And close application")
	public void verify_the_list_of_products_And_close_application() {
		System.out.println("TestMeApp verfiied list of products and closed");
	}

	@When("user selects product using sub-category")
	public void user_selects_product_using_sub_category() {
		System.out.println("user selected sub-category");
	}

	@When("user selects product using product name")
	public void user_selects_product_using_product_name() {
		System.out.println("user selected product name");
	}
	@Given("Testme displays Welcome message")
	public void testme_displays_Welcome_message() {
	   System.out.println("Welcome");
	}

}
