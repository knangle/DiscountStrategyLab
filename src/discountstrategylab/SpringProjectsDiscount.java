/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author Kevin
 */
public class SpringProjectsDiscount implements DiscountStrategy {
    
     public double getDiscount(double unitPrice, double qty){
     
         return (unitPrice * .15 * -1.0);
         
     }
    
}
