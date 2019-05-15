import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;


public class SearchCar {
    @Test
    public void test(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://auto.ru/cars/all/");
        webDriver.findElement(By.xpath("//div[contains(@class, 'ListingCarsFilters-module__column')]//span//label//button//span[contains(.,'Новые')]")).click();
        webDriver.findElement(By.xpath("//div[contains(@class, 'MMMFilter-module__MMMFilter__item')]//div//button//span[contains(., 'Марка')]")).click();
        webDriver.findElement(By.xpath("//div[contains(@class, 'Popup')]//div[contains(@class, 'MenuItem') and text()='Audi']")).click();
        webDriver.findElement(By.xpath("//div[contains(text(), 'Цена от')]/../input")).sendKeys("1500000");
        webDriver.findElement(By.xpath("//input[@name='price_to']")).sendKeys("2500000");
        webDriver.findElement(By.xpath("//div[contains(@class, 'ListingCarsFilters-module__columnControlHalf')]//span[contains(@class,'Link ListingCarsFilters-module__actionCollapse')]")).click();
        webDriver.findElement(By.xpath("//input[@name='in_stock']")).click();
        webDriver.findElement(By.xpath("//div[contains(@class, 'ListingCarsFilters-module__column')]//button//span[contains(@class, 'ButtonWithLoader__content')]")).click();
        assertThat("Gthtikb", webDriver.getCurrentUrl(), containsString("cars/audi/new/?sort=fresh_relevance_1-desc&price_from=1500000&price_to=2500000&in_stock=IN_STOCK"));
        webDriver.quit();
    }
}
