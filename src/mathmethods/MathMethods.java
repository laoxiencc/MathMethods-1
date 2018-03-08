/*
 * An example of rounding up a number using Math method.
 * Compare to getting rid of decimal places by changin the variable types.
 * 
 */

package mathmethods;

/**
 *
 * @author jixie2824
 */
public class MathMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double number=423;                      //original number
        int numberRounded;
        int numberRounded2;
        numberRounded=(int)Math.round(number);/*round up*/
        numberRounded2=(int)number;           /*get rid of decimals, no rounding up*/
        System.out.println("Before:   "+number+"\nRounded:  "+numberRounded+"\nRounded2: "+numberRounded2);
        double power=Math.pow(number, 2);     //power method
        System.out.println("Squared:  "+power);
    }
    
}
