package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/PrevisaoTempo.feature",
        glue = {""},
        plugin =  {"pretty"},
        monochrome = true,
        tags = "@Teste",
        dryRun = false)


public class TemperaturaRunner {

}
