package org.example.ddb;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {

    @Given("today is Sunday")
    public void today_is_sunday() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(4000);

    }
    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(4100);
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String string) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(4000);
    }
}
