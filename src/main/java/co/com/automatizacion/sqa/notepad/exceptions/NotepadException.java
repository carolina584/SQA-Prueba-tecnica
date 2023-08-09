package co.com.automatizacion.sqa.notepad.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class NotepadException extends SerenityManagedException{

	private static final long serialVersionUID = 1L;
	public static final String NOT_FOUND_ELEMENT = "Not element found";

	public NotepadException(String message, Throwable testErrorException) {
		super(message, testErrorException);
	}
}
