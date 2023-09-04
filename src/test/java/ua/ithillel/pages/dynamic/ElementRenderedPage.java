package ua.ithillel.pages.dynamic;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ua.ithillel.pages.BasePage;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class ElementRenderedPage extends BasePage {

    private SelenideElement startButton = $("button");
    private SelenideElement elementRendered = $(byId("finish"));

    public ElementRenderedPage() {
        super();
    }

    public ElementRenderedPage clickStartButton(){
        startButton.click();
        return this;
    }

    public SelenideElement getUploadedFileLabel() {
        return elementRendered.shouldBe(Condition.visible);
    }
}
