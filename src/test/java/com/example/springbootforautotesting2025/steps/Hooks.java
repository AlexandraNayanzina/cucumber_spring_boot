package com.example.springbootforautotesting2025.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Hooks {

    @Autowired
    private WebDriver driver;

    @Value("${cucumber.url}")
    private String appUrl;

    @Before
    public void beforeScenario(Scenario scenario) {
        driver.navigate().to(appUrl);
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println(scenario.getName());
        }
        driver.quit();
    }
}
