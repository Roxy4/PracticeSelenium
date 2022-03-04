package BddCucumber.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/java/BddCucumber/Feature"},
        glue ={"BddCucumber.StepDefination"},
        tags ={"@Regression"}
)

        public class GmailRunner {




}
