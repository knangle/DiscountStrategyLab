/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountStrategyLab3;

/**
 *
 * @author Kevin
 */
public class NoDiscount implements DiscountStrategy{
    
    public double getDiscountAmount(double unitPrice, double qty){
     
         return 0.0;
         
     }
    
}
