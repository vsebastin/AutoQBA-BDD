package testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Sebastian\\AutoQBA-BDD\\src\\test\\resources",glue="cyclosSteps")

public class CyclosRunner {

}
