package Exceptions;

/**
 * <p>
 * <strong>Author: </strong><br>
 * Joao Sousa<br>
 * <strong>Description: </strong><br>
 * Exception that
 * </p>
 */
public class InvalidNameException extends Exception {
    /**
     * Constructs an instance of <code>InvalidNameException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public InvalidNameException(String msg) {
        super(msg);
        System.out.println(msg);
    }
}
