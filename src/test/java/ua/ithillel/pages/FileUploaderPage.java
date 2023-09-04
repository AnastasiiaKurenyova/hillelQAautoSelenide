package ua.ithillel.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class FileUploaderPage extends BasePage {

    private SelenideElement chooseFileButton = $(byId("file-upload"));
    private SelenideElement uploadButton = $(byId("file-submit"));
    private SelenideElement uploadedFileLabel = $(byId("uploaded-files"));

    public FileUploaderPage() {
        super();
    }

    public FileUploaderPage open() {
        Selenide.open("/upload");
        return this;
    }

    public FileUploaderPage upload(File file) {
        chooseFileButton.uploadFile(file);
        return this;
    }

    public FileUploaderPage submit() {
        uploadButton.click();
        return this;
    }

    public SelenideElement getUploadedFileLabel() {
        return uploadedFileLabel;
    }
}
