package runner;
	
	import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	@RunWith(Cucumber.class)

	@CucumberOptions(features = "/Users/hiteshpkumar/Documents/workspace-spring-tool-suite-4-4.23.1.RELEASE/Project_cucumber/src/test/resources/SWAGONBOOKS/Boxsets.feature"
	,glue = "steps")
	public class TestRunner extends AbstractTestNGCucumberTests  {

	}



