/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountStrategyLab2;

/**
 *
 * @author Kevin
 */
public class BuyOneGetOneDiscount implements DiscountStrategy{
    
    public double getDiscountAmount(double unitPrice, double qty){
     
         return (((int)qty/2) * unitPrice * -1.0);
         
     }
    
}
