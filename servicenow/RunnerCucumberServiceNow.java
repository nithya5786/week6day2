package runner.servicenow;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(dryRun=false,features= {"src/test/java/featuresservicenow/CallerNew.feature",
		"src/test/java/featuresservicenow/CreateIncident.feature","src/test/java/featuresservicenow/CreateProposal.feature",
		"src/test/java/featuresservicenow/DeleteCaller.feature","src/test/java/featuresservicenow/DeleteIncident.feature"},glue= {"stepdefsservicenow"},monochrome=true)



public class RunnerCucumberServiceNow extends AbstractTestNGCucumberTests {

}
