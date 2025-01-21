package Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions( features="src\\test\\java\\Feature\\Log.feature",
glue="StepDefinitionParameter")
public class TestRunner {
	
}
