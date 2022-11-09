package Runners;


import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

@CucumberOptions(  // or olduğunda herhangi bir tanesi varsa çalıştırır
        // and olduğunda her ikisinin de bulundugu senaryolari calistirir.
        tags = "@Regression or @SmokeTest",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"}
        , plugin = { "html:target/cucumber-reports.html" }
        // windows için plugin = {"html:target//cucumber-reports.html"}
)
@Listeners({ExtentITestListenerClassAdapter.class})
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}
