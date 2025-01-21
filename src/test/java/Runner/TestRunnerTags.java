package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions( features="src\\test\\java\\Feature\\Tags.feature",
glue="Step_def_Tags", tags="@login")
public class TestRunnerTags {

}
