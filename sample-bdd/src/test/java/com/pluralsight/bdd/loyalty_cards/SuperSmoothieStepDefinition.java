package com.pluralsight.bdd.loyalty_cards;

import com.pluralsight.loyalty_cards.DrinkCatalog;
import com.pluralsight.loyalty_cards.MorningFreshnessMember;
import com.pluralsight.loyalty_cards.SuperSmoothieSchema;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class SuperSmoothieStepDefinition {
    private DrinkCatalog drinkCatalog = new DrinkCatalog();
    private SuperSmoothieSchema superSmoothieSchema = new SuperSmoothieSchema(drinkCatalog);
    private MorningFreshnessMember michael;

    @Given("the following drink categories")
    public void the_following_drink_categories(List<Map<String, String>> drinks) {
        drinks.forEach(t->{
            String drink = t.get("Drink");
            String category = t.get("Category");
            int points = Integer.parseInt(t.get("Points"));
            drinkCatalog.addDrink(drink, category);
            superSmoothieSchema.setPointsPerCategory(category, points);
        });
    }

    @Given("^(.*) is a morning freshness member")
    public void michael_is_a_morning_freshness_member(String name) {
        michael = new MorningFreshnessMember(name, superSmoothieSchema);
    }

    @When("^(.*) purchases (\\d+) (.*) drinks?")
    public void michael_purchases_Banana_drinks(String name, Integer amount, String drink) {
        michael.orders(amount, drink);
    }

    @Then("He should earn {int} points")
    public void he_should_earn_points(Integer expectedPoints) {
        assertThat(michael.getPoints()).isEqualTo(expectedPoints);
    }
}
