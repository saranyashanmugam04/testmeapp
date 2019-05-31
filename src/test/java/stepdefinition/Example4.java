package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example4 {
	@Given("user loggin to Testmeapp")
	public void user_loggin_to_Testmeapp() {
		System.out.println("user login");
	}

	@When("user selects product as {string}")
	public void user_selects_product_as(String pn) {
		System.out.println("entered product is "+pn);

	}

	@When("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
		System.out.println("user clicks on add to cart");

	}

	@When("User clicks on cart link")
	public void user_clicks_on_cart_link() {
		System.out.println("user clicks on cart link");

	}

	@When("user provides quantity as {int}")
	public void user_provides_quantity_as(Integer q) {
		System.out.println("user provided quantity as "+q);

	}

	@When("user proceed checkout")
	public void user_proceed_checkout() {
		System.out.println("user proceeds checkout");

	}

	@Then("verify the review and payment page")
	public void verify_the_review_and_payment_page() {
		System.out.println("user verifying payment page");

	}

}
