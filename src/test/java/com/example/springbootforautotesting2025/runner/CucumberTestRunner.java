package com.example.springbootforautotesting2025.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/resources/features",
            glue = "com.example.springbootforautotesting2025.steps"
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {


}
