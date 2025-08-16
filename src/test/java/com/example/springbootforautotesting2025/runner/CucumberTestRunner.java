package com.example.springbootforautotesting2025.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "classpath:features",
        glue = {"com.example.springbootforautotesting2025"},
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber-report.json", "summary"},
        monochrome = true,
        objectFactory = io.cucumber.spring.CucumberSpringObjectFactory.class
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}
