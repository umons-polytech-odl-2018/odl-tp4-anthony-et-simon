package exercise1;

public class ExceptionCatcher {
	private final ExceptionThrower exceptionThrower;		//instancie ds test unitaire

	public ExceptionCatcher(ExceptionThrower exceptionThrower) {	//appelle fonction dans test unitaire
		this.exceptionThrower = exceptionThrower;
	}

	void executeExceptionThrowerSafely(int value) {
		try {
			exceptionThrower.throwACustomExceptionWhenValueIs42(value);			//analyse s'il y a exception
		}
		catch (RuntimeException e) {						//si oui, ça catch l'exception
		}
	}
}
