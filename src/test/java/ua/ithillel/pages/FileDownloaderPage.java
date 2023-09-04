package ua.ithillel.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class FileDownloaderPage extends BasePage {

    public FileDownloaderPage() {
        super();
        Configuration.downloadsFolder = "target/downloads";
    }

    public FileDownloaderPage open() {
        Selenide.open("/download");
        return this;
    }

    public File download(String file) throws FileNotFoundException {
        return $(byText(file)).download();
    }

}
