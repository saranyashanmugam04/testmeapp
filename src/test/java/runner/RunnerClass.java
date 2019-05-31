package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/example5.feature",
					glue="stepdefinition",
					plugin="json:C:\\cucumber-html-report.json")
					//tags={"@category,@sub-category"})
public class RunnerClass {

}
