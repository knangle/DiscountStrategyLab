/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author Kevin
 */
public class NoDiscount implements DiscountStrategy{
    
    public double getDiscount(double unitPrice, double qty){
     
         return 0.0;
         
     }
    
}
