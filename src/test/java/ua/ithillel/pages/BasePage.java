package ua.ithillel.pages;

import com.codeborne.selenide.Configuration;

public class BasePage {

    public BasePage() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
    }


}
