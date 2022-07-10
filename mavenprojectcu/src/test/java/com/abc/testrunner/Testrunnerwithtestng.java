package com.abc.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(cucumber.class)                             //with junit
@CucumberOptions(features="src/test/resources", 
glue="com/stepdefination",
tags= "@smoketest or @regressiontest",

plugin= {"pretty","html:target/cucumber-reports.html","json:target/cucumber.jason"}		
		)//with testng
public class Testrunnerwithtestng  extends AbstractTestNGCucumberTests{

}
