package com.example.springbootforautotesting2025.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "classpath:features",
        glue = {"com.example.springbootforautotesting2025.steps"},
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber-report.json", "summary"},
        monochrome = true
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
