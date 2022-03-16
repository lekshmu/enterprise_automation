package Runner_file;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src\\main\\resources\\Features\\thirdparty.feature",
        glue= {"Stepdefinition"})
public class TestSuite {

}


