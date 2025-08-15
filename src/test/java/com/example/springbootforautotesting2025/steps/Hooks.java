package com.example.springbootforautotesting2025.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Hooks {

    @Autowired
    private WebDriver driver;

    @Before
    public void initTest(Scenario scenario) {
        driver.navigate().to("http://eaapp.somee.com");
    }

    @After
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()) {
            System.out.println(scenario.getName());
        }
        driver.quit();
    }
}
