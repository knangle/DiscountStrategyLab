/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author Kevin
 */
public interface Receipt {
    
   //public abstract void setCustomerName(String name);
//    public abstract void setCustomerName(String cardNo);
//    public abstract void setCardNumber(String cardNo);
    public abstract void addItem(LineItem newLine);
    public abstract void printReceipt();
    
}
