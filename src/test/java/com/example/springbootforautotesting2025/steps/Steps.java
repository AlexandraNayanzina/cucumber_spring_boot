package com.example.springbootforautotesting2025.steps;

import com.example.springbootforautotesting2025.config.CucumberTestContextConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.datatable.DataTable;
import com.example.springbootforautotesting2025.pages.HomePage;
import com.example.springbootforautotesting2025.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

@ContextConfiguration(classes = {CucumberTestContextConfig.class})
public class Steps {

    @Autowired
    private HomePage homePage;

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private WebDriverWait wait;

    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        homePage.clickLogin();
    }

    @And("I enter the following for Login")
    public void i_enter_the_following_for_login(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        Map<String, String> first = rows.get(0);
        String username = first.getOrDefault("username", "");
        String password = first.getOrDefault("password", "");
        loginPage.performLogin(username, password);
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Employee List")));
        Assert.assertTrue(homePage.isEmployeeListDisplayed(), "Employee List link should be visible after login");
    }
}
