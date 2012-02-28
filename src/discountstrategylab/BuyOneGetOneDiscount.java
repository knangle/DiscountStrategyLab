/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author Kevin
 */
public class BuyOneGetOneDiscount implements DiscountStrategy{
    
    public double getDiscount(double unitPrice, double qty){
     
         return ((qty/2) * unitPrice * -1.0);
         
     }
    
}
