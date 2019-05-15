import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class SearchCar {
    MainSteps mainSteps;

    @Rule
    public WebDriverRule driverRule = new WebDriverRule();

    @Before
    public void setUp() {
        mainSteps = new MainSteps(driverRule.driver());
    }

    @Test
    public void test() {
        mainSteps.openUrl("https://auto.ru/cars/all/");
        mainSteps.onMainPage().newCars().click();
        mainSteps.onMainPage().brand().click();
        mainSteps.onMainPage().nameBrand().click();
        mainSteps.onMainPage().priceFrom().sendKeys("1500000");
        mainSteps.onMainPage().priceTo().sendKeys("2500000");
        mainSteps.onMainPage().allParametrs().click();
        mainSteps.onMainPage().inStock().click();
        mainSteps.onMainPage().showCars().click();
        mainSteps.shouldSeeUrl("cars/audi/new/?sort=fresh_relevance_1-desc&price_from=1500000&price_to=2500000&in_stock=IN_STOCK");
    }
}
