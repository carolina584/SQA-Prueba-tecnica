package co.com.automatizacion.sqa.notepad.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;
import org.openqa.selenium.WebDriver;
import co.com.automatizacion.sqa.notepad.questions.NotepadQuestion;
import co.com.automatizacion.sqa.notepad.tasks.WriteNote;
import co.com.automatizacion.sqa.notepad.userinterfaces.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_lol.WEN;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class NotePadStepDefinition {
	
	
	@Managed(driver= "chrome")
	private WebDriver hisBrowser;

	private Actor user = Actor.named("Carolina");
	private HomePage page;
	
	
	@Before
	public void setUp() {
	
		user.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^user It is located on the notepad page$")
	public void userItIsLocatedOnTheNotepadPage() {
	   
		user.wasAbleTo(Open.browserOn(page));
	}
	
	@When("^user write rich tex '(.*)'$")
	public void theUserSelectsTheOptions(String data) {
	    
		 user.attemptsTo(WriteNote.inField((data)));
		   System.out.println("Ingreso información en note pad");
	}
	@SuppressWarnings("unchecked")
	@Then("^validates the bold text$")
	public void iValidateTheOutcomes() {
		user.should(seeThat(NotepadQuestion.inNotepad()));
	}
	
}
