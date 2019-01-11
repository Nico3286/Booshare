/**
 * 
 */
package hello.livres.exceptions;

/**
 * @author Dell
 *
 */
public class DateNaissanceException extends Exception {
	
	public String getMessage() {
		return "La date de naissance ne peut être supérieure à la date d'aujourd'hui";
	}

	
	/**
	 * 
	 */
	public DateNaissanceException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public DateNaissanceException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public DateNaissanceException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public DateNaissanceException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public DateNaissanceException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
