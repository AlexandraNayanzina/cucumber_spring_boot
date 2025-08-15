package com.example.springbootforautotesting2025.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class EmployeeListPage extends  BasePage {

    @FindBy(linkText = "Create New")
    private WebElement btnCreate;

    public void clickCreate() {
        btnCreate.click();
    }
}
