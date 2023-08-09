package co.com.automatizacion.sqa.notepad.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue="co.com.automatizacion.sqa.notepad.stepdefinitions",
        snippets= SnippetType.CAMELCASE)
public class NotePadRunner {

}
