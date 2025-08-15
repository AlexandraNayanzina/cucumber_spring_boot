package com.example.springbootforautotesting2025.steps;

import com.example.springbootforautotesting2025.pages.HomePage;
import com.example.springbootforautotesting2025.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.testng.Assert;


@Component
public class LoginSteps {

    @Autowired
    public HomePage homePage;

    @Autowired
    public LoginPage loginPage;

    @Given("I click login in Home Page")
    public void loginWithCorrectUsernameAndPassword() {
        homePage.clickLogin();
    }

    @And("I enter the following for login")
    public void iClickLoginInHomePage() {
        loginPage.performLogin("admin", "password");
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        Assert.assertEquals(homePage.isEmployeeListDisplayed(), true);

    }
}
