package ru.amalashok;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class CssXPathExamples {

    void CssXPathExamples() {
         $("[data-testid=email]").setValue("a@a.com");
         $(by("data-testid", "email")).setValue("a@a.com");
         $(byId("email")).setValue("a@a.com");
    }

}
