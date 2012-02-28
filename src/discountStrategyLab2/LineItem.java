/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountStrategyLab2;

/**
 *
 * @author Kevin
 */
public interface LineItem {
    
        public abstract  String getProductID();
        public abstract String getDescription();
        public abstract double getUnitPrice();
        public abstract double getQuantity();
        public abstract double getDiscountAmt();
        public abstract double getSubTotal();
}
