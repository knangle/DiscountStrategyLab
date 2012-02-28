/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author Kevin
 */
public interface DiscountStrategy {
    
    public abstract double getDiscount(double unitPrice, double qty);
    
}

