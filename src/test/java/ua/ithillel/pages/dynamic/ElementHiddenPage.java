package ua.ithillel.pages.dynamic;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ua.ithillel.pages.BasePage;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class ElementHiddenPage extends BasePage {

    private SelenideElement startButton = $("button");
    private SelenideElement elementHidden = $(byId("finish"));

    public ElementHiddenPage() {
        super();
    }

    public ElementHiddenPage clickStartButton(){
        startButton.click();
        return this;
    }

    public SelenideElement getUploadedFileLabel() {
        return elementHidden.shouldBe(Condition.visible).shouldNotBe(Condition.hidden);
    }
}
