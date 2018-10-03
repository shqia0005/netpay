/*
 * To find the net pay for an employee.
 * Jessica Qiao
 * Septembr 19th,2018
 */

package netpay;

/**
 *
 * @author shqia0005
 */
public class Netpay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h = 40;
        double w = 5.00;
        double i = 2.00;
        double t = 0.22;
        double n = 0.0;
        
        
       
        
        
        
        //Use the following formula
        n = (h*w-i) -t*(h*w-i);
        
        System.out.println("The net pay for an employee is $" +n);
    }
    
}
