package com.example.springbootforautotesting2025.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HomePage extends BasePage {

    // Locators
    @FindBy(linkText = "Login")
    private WebElement lnkLogin;

    @FindBy(linkText = "Employee List")
    private WebElement lnkEmployeeList;

    @FindBy(linkText = "Log off")
    private WebElement lnkLogoff;

    @FindBy(linkText = "Employee Details")
    private WebElement lnkEmployeeDetails;

    public void clickLogin() {
        lnkLogin.click();
    }

    public void clickEmployeeList() {
        lnkEmployeeList.click();
    }

    public void LogOff() {
        lnkLogoff.click();
    }

    public boolean isEmployeeListDisplayed() {
        return lnkEmployeeList.isDisplayed();
    }

}
