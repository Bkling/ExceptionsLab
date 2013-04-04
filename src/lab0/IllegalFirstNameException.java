/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

/**
 *
 * @author Bkling
 */
class IllegalFirstNameException extends Exception {

    private static String MSG = "Please enter a valid first name.";

    public IllegalFirstNameException() {
    }

    public IllegalFirstNameException(String message) {
        super(MSG);
    }

    public IllegalFirstNameException(String message, Throwable t) {
        super(MSG, t);
    }

    public IllegalFirstNameException(Throwable t) {
        super(t);
    }
}
