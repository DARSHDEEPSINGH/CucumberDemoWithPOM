package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					//features= {".//Features/"},//all frature files
					features= {".//Features/Login.feature"},
					//features= {".//Features/LoginDDTExcel.feature"},// for specific feature files
					//features= {".//Features/Login.feature",".//Features/Registration.feature"},
					//features= {"@target/rerun.txt"},            // for running failed scenarios after failure from previous runs
					
					
					
					glue="stepDefinitions",// gerkin keyword to define stepdefinitions
					plugin= {"pretty", "html:reports/myreport.html", // for generating cucumber reports and location of reports
							  "rerun:target/rerun.txt",
							  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
							},
							
					dryRun=false,    // checks mapping between scenario steps and step definition methods(Whether all features having corresponding stepdefinition methods)
					
					monochrome=true,    // to avoid junk characters in output
					
					publish=true   // to publish report in cucumber server & get reports form reports folder
					
					
					//Tags:::Add tags on every scenario in feature files.
					//tags="@sanity"  // this will execute scenarios tagged with @sanity
					//tags="@regression"
					//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
					//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
					//tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
		)
public class TestRunner {

	//This class should be empty always.
		}
