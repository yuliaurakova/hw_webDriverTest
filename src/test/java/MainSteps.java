import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.WebPageFactory;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class MainSteps {
    WebDriver webDriver;

    MainSteps(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void openUrl(String url) {
        webDriver.get(url);
    }

    public MainPage onMainPage() {
        return on(MainPage.class);
    }

    public void shouldSeeUrl(String url) {
        assertThat("Перешли на другой урл c параметрами", webDriver.getCurrentUrl(), containsString(url));
    }

    protected <T extends WebPage> T on(Class<T> pageClass) {
        WebPageFactory factory = new WebPageFactory();
        return factory.get(webDriver, pageClass);
    }
}
