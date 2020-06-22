package Stepdefs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:result/cucumber",
                //  "de.monochromata.cucumber.report.PrettyReports:result/cucumber"},
        },
        features={"src/test/resources"},
        glue = {"Steps"},
        monochrome = false,
        tags = "@Sad"

)


public class RunCucumber {
}
