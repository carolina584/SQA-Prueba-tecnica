package co.com.automatizacion.sqa.notepad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.online-notepad.net/es/bloc-de-notas-online")
public class HomePage extends PageObject{

	public static final Target BOLD_FONT= Target.the("Button New Note").locatedBy("//*[@id='richtextnote']/main/div/div/div[1]/div/div[1]/button[1]");
	public static final Target BUTTON_ENRICHED_NOTE= Target.the("Select Enriched Note").locatedBy("(//button[@id='richtextnote-tab'])[1]");
	public static final Target FIELD_NOTE= Target.the("Write Field Note").locatedBy("(//button[@id='richtextnote-tab'])[1]");
	public static final Target BUTTON_NEW_NOTE= Target.the("Button New Note").locatedBy("//a[@id='newNote']");
	public static final Target LIST_NOTE= Target.the("Button New Note").locatedBy("//a[@id='itemId-50782']");
	
}









