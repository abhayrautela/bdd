Feature: Super Smoothie Loyalty Card Program
  The more smoothie you buy, the more points you earn.

  Background:
    Given the following drink categories
      | Drink              | Category | Points |
      | Banana             | Regular  | 15     |
      | Triple Berry Blend | Fancy    | 20     |
      | Earl Grey          | Tea      | 30     |

  Scenario Outline: Earning points when purchasing smoothies
    Given Michael is a morning freshness member
    When Michael purchases <Quantity> <Drink> drinks
    Then He should earn <Points> points

    Examples:
      | Drink              | Quantity | Points |
      | Banana             | 2        | 15     |
      | Triple Berry Blend | 1        | 20     |
      | Earl Grey          | 3        | 30     |