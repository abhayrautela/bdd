package com.pluralsight.bdd.calculator;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.pluralsight.bdd.calculator",
                 features = "classpath:features/calculator")
public class CalculatorTestSuite {
}
