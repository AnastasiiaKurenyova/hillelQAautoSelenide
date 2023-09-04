package ua.ithillel.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ua.ithillel.pages.FileDownloaderPage;
import ua.ithillel.pages.FileUploaderPage;

import java.io.File;
import java.io.FileNotFoundException;


public class LoadTest extends BaseTest {

    @ParameterizedTest
    @ValueSource(strings = {"img.png", "test.txt"})
    @DisplayName("Verify File Downloader Test")
    public void downloadTest(String fileName) throws FileNotFoundException {
        FileDownloaderPage fileDownloaderPage = new FileDownloaderPage();

        File file = fileDownloaderPage
                .open()
                .download(fileName);

        Assertions.assertEquals(file.getName(), fileName);
    }

    @ParameterizedTest
    @ValueSource(strings = {"img.png", "test.txt"})
    @DisplayName("Verify File Uploader Test")
    public void uploadTest(String fileName) {
        File file = new File("src\\files\\" + fileName);
        FileUploaderPage fileUploaderPage = new FileUploaderPage();
        fileUploaderPage.open()
                        .upload(file)
                        .submit()
                        .getUploadedFileLabel()
                        .shouldHave(Condition.text(fileName));
    }

}
