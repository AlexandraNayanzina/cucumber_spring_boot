package com.example.springbootforautotesting2025.libs;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class WebDriverWaitingConfig {


    @Value("${selenium.explicit_waiting_sec}")
    private int waitingSec;

    private WebDriverWait wait;

    @Autowired
    private WebDriver driver;

    @Bean
    public WebDriverWait getWebDriverWait() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(waitingSec));
        return wait;
    }
}
