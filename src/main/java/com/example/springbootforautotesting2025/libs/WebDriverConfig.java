//package com.example.springbootforautotesting2025.libs;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//@Configuration
//public class WebDriverConfig {
//
//
//    @Value("${selenium.browser}")
//    private String browser;
//
//    @Value("${selenium.url}")
//    private String url;
//
//
//    @Bean
//    public WebDriver WebDriver() {
//
//        WebDriver driver = null;
//        if (browser.equalsIgnoreCase("chrome")) {
//            driver = new ChromeDriver();
//            driver.navigate().to(url);
//        } else if (browser.equalsIgnoreCase("firefox")) {
//            driver = new FirefoxDriver();
//            driver.navigate().to(url);
//        } else if (browser.equalsIgnoreCase("safari")) {
//            driver = new SafariDriver();
//            driver.navigate().to(url);
//        }
//        return driver;
//    }
//
//
//}
