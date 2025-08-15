package com.example.springbootforautotesting2025.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class LoginPage extends BasePage {

    // Locators
    @FindBy(id = "UserName")
    private WebElement lnkUserName;

    @FindBy(id = "Password")
    private WebElement lnkPassword;

    @FindBy(id = "loginIn")
    private WebElement lnkLogin;

    public void performLogin(String username, String password) {
        lnkUserName.sendKeys(username);
        lnkPassword.sendKeys(password);
        lnkLogin.click();
    }
}
