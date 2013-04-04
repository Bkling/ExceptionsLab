/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Bkling
 */
public class ArrayIndexOutOfBoundsException extends Exception {
        public final static String MSG = "Please enter a full name. Ex: Benjamin Kling or Benjamin Anthony Kling";

    public ArrayIndexOutOfBoundsException() {
    }

    public ArrayIndexOutOfBoundsException(String message) {
        super(MSG);
    }

    public ArrayIndexOutOfBoundsException(String message, Throwable t) {
        super(MSG, t);
    }

    public ArrayIndexOutOfBoundsException(Throwable t) {
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
