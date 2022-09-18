package ru.amalashok;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class CssXPathExamples {
    void CssXPathExamples() {
         $("[data-testid=email]").setValue("a@a.com");
         $(by("data-testid", "email")).setValue("a@a.com");
    }

}
