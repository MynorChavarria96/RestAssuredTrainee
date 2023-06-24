package io.reqres.test.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features ="src/test/resources/features/reqres_general_services.feature",
        glue ={"io.reqres.main.stepdefinitions", "io.reqres.main.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class ReqresRunnerTest {
}
