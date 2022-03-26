package test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class stepdefinitions {

	@Given("Print scenario one")
	public void print_scenario_one() {
		System.out.println("scenario one");
	}
	@When("Print xwing")
	public void print_xwing() {
	    System.out.println("xwing");
	}
	
	@Given("Print scenario two")
	public void print_scenario_two() {
		System.out.println("scenario two");
	}
	@When("Print millenium falcon")
	public void print_millenium_falcon() {
		System.out.println("millenium falcon");
	}


	@Given("Print scenario three")
	public void print_scenario_three() {
		System.out.println("scenario three");
	}
	@When("Print razor crest")
	public void print_razor_crest() {
		System.out.println("razor crest");
	}

	@Given("Print scenario four")
	public void print_scenario_four() {
		System.out.println("scenario four");
	}
	@When("Print starfighter")
	public void print_starfighter() {
		System.out.println("starfighter");
	}	
}