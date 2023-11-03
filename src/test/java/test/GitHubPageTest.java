package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubPageTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1366x766";
        Configuration.pageLoadStrategy = "eager";
        //Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000
    }

    @Test
    void SuccessTest() {
        open("https://github.com/");
        $("ul.d-lg-flex.list-style-none")
                .$(byText("Solutions")).hover();
        $("a[href='/enterprise']").click();
        $("div.enterprise-hero-background.overflow-hidden")
                .shouldHave(text("To build, scale, and deliver secure software."));



    }
}

