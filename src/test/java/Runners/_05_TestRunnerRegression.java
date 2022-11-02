package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  // or olduğunda herhangi bir tanesi varsa çalıştırır
        // and olduğunda her ikisinin de bulundugu senaryolari calistirir.
        tags = "@Regression or @SmokeTest", // hangi senaryolarda bu etiket varsa onlar çalıştırılacak
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"}
        ,plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
)
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}  // Browser tipi vermek için, rapora ek parametre eklemek için sonra kullanacağız
