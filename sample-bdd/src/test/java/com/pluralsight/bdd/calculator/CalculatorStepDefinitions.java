package com.pluralsight.bdd.calculator;

import com.pluralsight.calculator.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorStepDefinitions {

    private Calculator calculator;
    private Integer result;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();
        result = calculator.add(int1, int2);
    }

    @Then("I should get {int}")
    public void i_should_get(Integer expectedResult) {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();
        assertThat(result).isEqualTo(expectedResult);

    }

}
