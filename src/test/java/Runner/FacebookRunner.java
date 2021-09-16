package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/Features/facebook.feature"},
glue={"Steps"}, dryRun = false)
public class FacebookRunner {
}
