/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountStrategyLab3;

/**
 *
 * @author Kevin
 */
public class SpringProjectsDiscount implements DiscountStrategy {
    
     public double getDiscountAmount(double unitPrice, double qty){
     
         return (unitPrice * .15 * -1.0);
         
     }
    
}
