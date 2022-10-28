package runner;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features/OutlineDemo.feature",
		glue={"com.stepDefinition"},
		//plugin={"pretty","html:test-output","json:json_output/cucumber.json"},
		//monochrome=true,
		dryRun=false
		
		)
public class TestRunner {

	
}
