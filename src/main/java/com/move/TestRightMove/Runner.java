package com.move.TestRightMove;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import cucumber.api.java.it.Date;
import cucumber.api.junit.Cucumber;

// runner class

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(features = { "src\\main\\resources\\Features\\" }
   )
// @Cucumber.Options(format={"html:output"}

public class Runner {

}
