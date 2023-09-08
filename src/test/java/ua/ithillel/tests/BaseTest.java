package ua.ithillel.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public void init(){
        Configuration.browser = "chrome";
        Configuration.browserVersion = "114";
        Configuration.timeout = 10000;
    }

    @AfterEach
    public void quit(){
        Selenide.closeWebDriver();
    }
}
