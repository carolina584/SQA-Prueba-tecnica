package co.com.automatizacion.sqa.notepad.questions;

import static co.com.automatizacion.sqa.notepad.userinterfaces.HomePage.LIST_NOTE;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

public class NotepadQuestion implements Question<String>{

private String flight;
	
	@Step("Validate flight")
	@Override
	public String answeredBy(Actor actor) {
		
		flight = Text.of(LIST_NOTE).answeredBy(actor).toString();
		System.out.println("Obtengo el valor del destino" + flight);
		return Text.of(LIST_NOTE).answeredBy(actor).toString();
	}
	
	public static NotepadQuestion inNotepad() {
		return new NotepadQuestion();
	}

}
