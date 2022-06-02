package testRunner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features= {".//Features/"},
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		        "html:test-output/cucumber_html_report"}
		)

public class TestRun {

}
 