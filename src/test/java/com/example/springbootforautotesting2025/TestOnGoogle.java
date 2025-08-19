package com.example.springbootforautotesting2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;


@SpringBootTest
public class TestOnGoogle extends AbstractTestNGSpringContextTests {

//    @Autowired
//    private WebDriver driver;
//
//    @Autowired
//    private WebDriverWait wait;

    @Test
    public void test_one(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--headless");
        WebDriver driver1= new ChromeDriver(options);

        WebDriverWait wait1 = new WebDriverWait(driver1, Duration.ofSeconds(10));
        driver1.navigate().to("https://www.google.com/");
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("About")));
        driver1.quit();
    }

//    @AfterTest
//    public void closeBrowser() {
//        driver1.quit();
//    }
}
