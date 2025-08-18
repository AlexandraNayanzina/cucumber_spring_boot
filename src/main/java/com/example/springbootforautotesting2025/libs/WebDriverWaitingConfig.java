package com.example.springbootforautotesting2025.libs;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.Duration;

@Configuration
@Scope("driverscope")
public class WebDriverWaitingConfig {


    @Value("${selenium.explicit_waiting_sec}")
    private int waitingSec;

    @Autowired
    private WebDriver driver;

    @Bean
    @Scope("driverscope")
    public WebDriverWait getWebDriverWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(waitingSec));
    }
}
