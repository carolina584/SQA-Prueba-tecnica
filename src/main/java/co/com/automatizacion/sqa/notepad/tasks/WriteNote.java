package co.com.automatizacion.sqa.notepad.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import org.openqa.selenium.Keys;

import co.com.automatizacion.sqa.notepad.exceptions.NotepadException;
import co.com.automatizacion.sqa.notepad.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class WriteNote implements Task{

	private String info;

	public WriteNote(String name) {
		this.info = name;
	}

	@Step("Write Note")
	@Override
	public <T extends Actor> void performAs(T actor) {

		try {
			actor.attemptsTo(
					
			Click.on(HomePage.BUTTON_ENRICHED_NOTE),
			Click.on(HomePage.BOLD_FONT),
			Enter.theValue(info).into(HomePage.FIELD_NOTE).thenHit(Keys.ENTER),
			Click.on(HomePage.BUTTON_NEW_NOTE));
		} catch (Exception e) {
			throw new NotepadException(NotepadException.NOT_FOUND_ELEMENT, e);
		}}

	public static WriteNote inField(String data) {
		return instrumented(WriteNote.class, data);
	}

}
