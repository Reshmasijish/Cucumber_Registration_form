package Runner_file;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/cucumber_regform_regform/src/test/java/Feature_files/Regform.feature", 
glue = "Step_Defenitions", tags = "@RegressionTest")


public class Regform {

}
