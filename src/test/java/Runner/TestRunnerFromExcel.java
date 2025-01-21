package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features="src\\test\\java\\Feature\\ReadDataFromExcel.feature",
glue="Step_def_from_Excel")
public class TestRunnerFromExcel {

}
