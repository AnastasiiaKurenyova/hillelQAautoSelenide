package ua.ithillel.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ua.ithillel.pages.dynamic.DynamicallyLoadedPage;


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
                .shouldHave(Condition.text("Hello World!"));
    }

    @Test
    @DisplayName("Verify Hidden Element Test")
    public void renderedElementTest() {
        DynamicallyLoadedPage dynamicallyLoadedPage = new DynamicallyLoadedPage();
        dynamicallyLoadedPage
                .open()
                .openElementRenderedPage()
                .clickStartButton()
                .getUploadedFileLabel()
                .shouldHave(Condition.text("Hello World!"));
    }
}
