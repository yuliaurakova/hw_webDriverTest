import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.htmlelements.element.HtmlElement;

public interface MainPage extends WebPage {
    @FindBy("//div[contains(@class, 'ListingCarsFilters-module__column')]//span//label//button//span[contains(.,'Новые')]")
    HtmlElement newCars();

    @FindBy("//div[contains(@class, 'MMMFilter-module__MMMFilter__item')]//div//button//span[contains(., 'Марка')]")
    HtmlElement brand();

    @FindBy("//div[contains(@class, 'Popup')]//div[contains(@class, 'MenuItem') and text()='Audi']")
    HtmlElement nameBrand();

    @FindBy("//input[@name='price_from']")
    HtmlElement priceFrom();

    @FindBy("//input[@name='price_to']")
    HtmlElement priceTo();

    @FindBy("//div[contains(@class, 'ListingCarsFilters-module__columnControlHalf')]//span[contains(@class,'Link ListingCarsFilters-module__actionCollapse')]")
    HtmlElement allParametrs();

    @FindBy("//input[@name='in_stock']")
    HtmlElement inStock();

    @FindBy("//div[contains(@class, 'ListingCarsFilters-module__column')]//button//span[contains(@class, 'ButtonWithLoader__content')]")
    HtmlElement showCars();
}