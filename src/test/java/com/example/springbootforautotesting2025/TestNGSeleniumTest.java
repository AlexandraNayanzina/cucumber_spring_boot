package com.example.springbootforautotesting2025;

import com.example.springbootforautotesting2025.pages.CreateEmployeePage;
import com.example.springbootforautotesting2025.pages.EmployeeListPage;
import com.example.springbootforautotesting2025.pages.HomePage;
import com.example.springbootforautotesting2025.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@SpringBootTest
public class TestNGSeleniumTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private WebDriver driver;

    @Autowired
    private WebDriverWait wait;

    @Autowired
    private CreateEmployeePage createEmployeePage;

    @Autowired
    private EmployeeListPage employeeListPage;

    @Autowired
    private HomePage homePage;

    @Autowired
    private LoginPage loginPage;

    @Test
    void contextLoads() {

        driver.navigate().to("http://eaapp.somee.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));
        homePage.clickLogin();
        loginPage.performLogin("admin", "password");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Employee List")));
        homePage.clickEmployeeList();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Create New")));
        employeeListPage.clickCreate();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Employee']")));
        createEmployeePage.performEmployeeCreation("Alex", "5000", "1", 1, "test@test.test");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Employee List")));
        homePage.LogOff();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}
