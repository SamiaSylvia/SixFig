package com.mit.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Feature",
		glue = "com.mit.steps",
		tags = "@smokeTest"
		)

public class TestRunnerSmokeTests extends AbstractTestNGCucumberTests{

}
