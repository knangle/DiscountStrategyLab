/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountStrategyLab3;

/**
 *
 * @author Kevin
 */
public interface Receipt {
    
    public abstract void beginSale(String custNo);
    public abstract void addItem(String productID, double qty);
    public abstract void printReceipt();
    
}
