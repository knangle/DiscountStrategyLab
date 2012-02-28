/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountStrategyLab3;

/**
 *
 * @author Kevin
 */
public interface DiscountStrategy {
    
    public abstract double getDiscountAmount(double unitPrice, double qty);
    
}

