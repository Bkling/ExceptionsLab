/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

/**
 *
 * @author Bkling
 */
class IllegalLastNameException extends Exception {
        private static String MSG = "Please enter a valid last name.";

    public IllegalLastNameException() {
    }

    public IllegalLastNameException(String message) {
        super(MSG);
    }

    public IllegalLastNameException(String message, Throwable t) {
        super(MSG, t);
    }

    public IllegalLastNameException(Throwable t) {
        super(t);
    }
        
        
}
