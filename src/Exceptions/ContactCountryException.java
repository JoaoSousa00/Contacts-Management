package Exceptions;

/**
 * <p>
 * <strong>Author: </strong><br>
 * Joao Sousa<br>
 * <strong>Description: </strong><br>
 * Exception that
 * </p>
 */
public class ContactCountryException extends Exception {

    /**
     * Constructs an instance of <code>CountryIdentifierException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public ContactCountryException(String msg) {
        super(msg);
        System.out.println(msg);
    }
}
