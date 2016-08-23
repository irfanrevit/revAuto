package com.autoBdd.testRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "classpath:features",
	glue = "classpath:automatictester.jwebfwk.steps",
	tags = "@orig,@copy",
	plugin = {"pretty"})
public class TestNGRunnerTest extends AbstractTestNGCucumberTests {
}