package ua.ithillel.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ua.ithillel.pages.dynamic.DynamicallyLoadedPage;

import java.time.Duration;


public class DynamicallyLoadedTest extends BaseTest {

    @Test
    @DisplayName("Verify Hidden Element Test")
    public void hiddenElementTest() {
        DynamicallyLoadedPage dynamicallyLoadedPage = new DynamicallyLoadedPage();
        dynamicallyLoadedPage
                .open()
                .openElementHiddenPage()
                .clickStartButton()
                .getUploadedFileLabel()
                .shouldBe(Condition.visible, Duration.ofSeconds(10000))
                .shouldNotBe(Condition.hidden)
                .shouldHave(Condition.text("Hello World!"));
    }

    @Test
    @DisplayName("Verify Rendered Element Test")
    public void renderedElementTest() {
        DynamicallyLoadedPage dynamicallyLoadedPage = new DynamicallyLoadedPage();
        dynamicallyLoadedPage
                .open()
                .openElementRenderedPage()
                .clickStartButton()
                .getUploadedFileLabel()
                .shouldBe(Condition.visible, Duration.ofSeconds(10000))
                .shouldHave(Condition.text("Hello World!"));
    }
}
