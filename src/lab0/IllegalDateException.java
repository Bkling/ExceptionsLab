/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

/**
 *
 * @author bkling
 */
public class IllegalDateException extends Exception {
    
    public static final String MSG = "Enter a date within a month of todays current date";

    public IllegalDateException() {
    }

    public IllegalDateException(String message) {
        super(MSG);
    }

    public IllegalDateException(String message, Throwable t) {
        super(MSG, t);
    }

    public IllegalDateException(Throwable t) {
        super(t);
    }
    
    @Override
    public String getMessage(){
        return MSG;
    }
    
    @Override
    public String getLocalizedMessage(){
        return MSG;
    }
}
