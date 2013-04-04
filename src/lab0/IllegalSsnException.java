/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

/**
 *
 * @author Bkling
 */
class IllegalSsnException extends Exception {

    private static String MSG = "Please enter a valid ssn.";

    public IllegalSsnException() {
    }

    public IllegalSsnException(String message) {
        super(MSG);
    }

    public IllegalSsnException(String message, Throwable t) {
        super(MSG, t);
    }

    public IllegalSsnException(Throwable t) {
        super(t);
    }
}
