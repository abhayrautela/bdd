package com.pluralsight.bdd.calculator;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions
        (glue = "com.pluralsight.bdd.calculator",
                features = "classpath:features/calculator")
public class CalculatorTestSuite {
}
