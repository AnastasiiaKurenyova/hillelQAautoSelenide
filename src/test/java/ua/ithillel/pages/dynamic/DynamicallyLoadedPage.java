package ua.ithillel.pages.dynamic;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import ua.ithillel.pages.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class DynamicallyLoadedPage extends BasePage {

    private SelenideElement elementHiddenLink = $("a[href='/dynamic_loading/1']");
    private SelenideElement elementRenderedLink = $("a[href='/dynamic_loading/2']");

    public DynamicallyLoadedPage() {
        super();
    }

    public DynamicallyLoadedPage open() {
        Selenide.open("/dynamic_loading");
        return this;
    }

    public ElementHiddenPage openElementHiddenPage() {
        elementHiddenLink.click();
        return new ElementHiddenPage();
    }

    public ElementRenderedPage openElementRenderedPage() {
        elementRenderedLink.click();
        return new ElementRenderedPage();
    }

}
