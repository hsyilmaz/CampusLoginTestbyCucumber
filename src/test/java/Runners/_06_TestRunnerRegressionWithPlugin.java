package Runners;


import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"},
        plugin = {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}

)
@Listeners({ExtentITestListenerClassAdapter.class})
public class _06_TestRunnerRegressionWithPlugin extends AbstractTestNGCucumberTests {

}
