package com.dimagi.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"D:\\javaworkspace\\Dimagi\\src\\test\\java\\BasicModuleFeatures"}, glue="com.dimagi.steps", format={"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
tags="@basictestcases")
public class TestRunner extends AbstractTestNGCucumberTests{

}
