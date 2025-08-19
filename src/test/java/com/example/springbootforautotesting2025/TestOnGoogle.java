package com.example.springbootforautotesting2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


@SpringBootTest
public class TestOnGoogle extends AbstractTestNGSpringContextTests {

    @Autowired
    private WebDriver driver;

    @Autowired
    private WebDriverWait wait;

    @Test
    void google_test(){
        driver.navigate().to("http://eaapp.somee.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("About")));
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
