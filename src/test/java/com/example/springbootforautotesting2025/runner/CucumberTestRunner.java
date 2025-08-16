package com.example.springbootforautotesting2025.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.example.springbootforautotesting2025.steps"},
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber-report.json"},
        monochrome = true
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}
