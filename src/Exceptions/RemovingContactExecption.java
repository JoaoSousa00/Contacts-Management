package Exceptions;

/**
 * <p>
 * <strong>Author: </strong><br>
 * Joao Sousa<br>
 * <strong>Description: </strong><br>
 * Exception that
 * </p>
 */
public class RemovingContactExecption extends Exception {

    /**
     * Constructs an instance of <code>RemovingContactExecption</code> with the specified detail message.
     * @param msg the detail message.
     */
    public RemovingContactExecption(String msg) {
        super(msg);
        System.out.println(msg);
    }
}
