/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

/**
 *
 * @author Bkling
 */
class IllegalVacationDaysException extends Exception {

    private static String MSG = "Vacation Days has to be between 0 and 28.";

    public IllegalVacationDaysException() {
    }

    public IllegalVacationDaysException(String message) {
        super(MSG);
    }

    public IllegalVacationDaysException(String message, Throwable t) {
        super(MSG, t);
    }

    public IllegalVacationDaysException(Throwable t) {
        super(t);
    }
}
