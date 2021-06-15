package com.test.sahaja.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = {"com/test/sahaja/steps"}, tags = "@Regression",
        plugin = {"pretty", "html:target/report/cucumber.html",
                "json:target/report/cucumber.json"},
        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {

}
