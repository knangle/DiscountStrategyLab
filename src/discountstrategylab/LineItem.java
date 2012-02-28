/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author Kevin
 */
public interface LineItem {
    
    public abstract void setProductNumber(String productNumber);
    public abstract void setProductDescription(String productDescription);
    public abstract void setQuantity(double quantity);
    public abstract void setUnitPrice();
    public abstract void setDiscountAmount();
    public abstract void setSubTotal();
    public abstract String getProductNumber();
    public abstract String getProductDescription();
    public abstract double getQuantity();
    public abstract double getUnitPrice();
    public abstract double getDiscountAmount();
    public abstract double getSubTotal();
}
