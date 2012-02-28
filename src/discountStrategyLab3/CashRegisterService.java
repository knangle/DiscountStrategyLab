/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountStrategyLab3;


/**
 *
 * @author Kevin
 */
public class CashRegisterService {
    
    private Receipt receipt;
    
    public CashRegisterService (){}
    
    public void startNewSale(String custNo){
        RetailReceipt receipt = new RetailReceipt();
        this.receipt = receipt;
        receipt.beginSale(custNo);
    }

    public void addProduct(String productID, double qty){
        receipt.addItem(productID, qty);
        
    }
    public void finalizeSale(){
        receipt.printReceipt();
    }
 
}
