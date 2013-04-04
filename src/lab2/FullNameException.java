/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Benjamin
 */
public class FullNameException extends Exception {

    public final static String MSG = "Please enter a full name. Ex: Benjamin Kling or Benjamin Anthony Kling";

    public FullNameException() {
    }

    public FullNameException(String message) {
        super(MSG);
    }

    public FullNameException(String message, Throwable t) {
        super(MSG, t);
    }

    public FullNameException(Throwable t) {
        super(t);
    }

    @Override
    public String getMessage() {
        return MSG;
    }

    @Override
    public String getLocalizedMessage() {
        return MSG;
    }
}
