package com.autoBdd.pageObj;

import org.openqa.selenium.WebDriver;

import com.autoBdd.framework.ParentPage;

public class MainPage extends ParentPage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickTab(String tab) {
        click(tab);
    }

}
