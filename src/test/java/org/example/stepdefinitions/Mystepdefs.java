package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mystepdefs {
    @Given("browser window is open")
    public void browser_window_is_open() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Succesfully opened browser window");
    }
    @Given("Enter url")
    public void enter_url() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Entered url");
    }
    @When("Google is opened")
    public void google_is_opened() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Google is opened");
    }
    @Then("search {string} and {string} with google")
    public void search_something_with_google(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Search of "+username+"and"+password+" successful");
    }
    @Then("click Enter")
    public void click_enter() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Enter is successful");
    }

}
