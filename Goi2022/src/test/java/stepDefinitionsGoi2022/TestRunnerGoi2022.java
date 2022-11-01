package stepDefinitionsGoi2022;




import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"./src/test/resources/FeatureFilesGoi2022"},
		glue= {"stepDefinitionsGoi2022", "hooks"},
		tags= "@USdemo",
		plugin= {"pretty"}
		//	dryRun = true


		)

//features= {"src/test/resources/FeatureFilesGoi2022"}, , @Production



public class TestRunnerGoi2022 {

}
