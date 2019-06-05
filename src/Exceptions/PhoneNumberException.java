package Exceptions;

/**
 * <p>
 * <strong>Author: </strong><br>
 * Joao Sousa<br>
 * <strong>Description: </strong><br>
 * Exception that
 * </p>
 */
public class PhoneNumberException extends Exception {

    /**
     * Constructs an instance of <code>PhoneNumberException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public PhoneNumberException(String msg) {
        super(msg);
        System.out.println(msg);
    }
}
