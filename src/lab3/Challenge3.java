/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author bkling
 */
public class Challenge3 {
    public static void main(String[] args) {
        try{
           InputOutputGui iog = new InputOutputGui();
           iog.startConversation();
        } catch (InvalidNameException ine) {
            System.out.println(ine.getMessage());
        }
    }
}
