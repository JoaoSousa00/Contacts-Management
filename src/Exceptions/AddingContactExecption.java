package Exceptions;

/**
 * <p>
 * <strong>Author: </strong><br>
 * Joao Sousa<br>
 * <strong>Description: </strong><br>
 * Exception that
 * </p>
 */
public class AddingContactExecption extends Exception {

    /**
     * Constructs an instance of <code>AddingContactExecption</code> with the specified detail message.
     * @param msg the detail message.
     */
    public AddingContactExecption(String msg) {
        super(msg);
        System.out.println(msg);
    }
}
