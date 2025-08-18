//package com.example.springbootforautotesting2025.libs;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.net.URL;
//
//
//@Configuration
//public class RemoteWebDriverFactory {
//
//
//    @Value("${grid.url}")
//    public URL gridURL;
//
//
//    @Bean
//    public WebDriver getRemoteWebDriverForChrome() {
//        return new RemoteWebDriver(gridURL, new DesiredCapabilities("chrome", "", null));
//    }
//}
