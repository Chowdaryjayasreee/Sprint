package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
                 glue="StepDefinitions",
                 tags="@SanityTest")

public class LoginRun {
	

}
