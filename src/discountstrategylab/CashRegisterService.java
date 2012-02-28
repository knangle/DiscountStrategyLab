/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Kevin
 */
public class CashRegisterService {
    
    private LineItem LineItemFunction;
    private Receipt ReceiptFunction;
    
    public CashRegisterService (Receipt salesSlip){
        this.ReceiptFunction = salesSlip; 
    }
    public void startNewSale(String custNo){
    }

    public void addProduct(String productID, double qty,LineItem item){
        this.LineItemFunction = item;
        LineItemFunction.setProductNumber(productID);
        LineItemFunction.setProductDescription(productID);
        LineItemFunction.setUnitPrice();
        LineItemFunction.setQuantity(qty);
        LineItemFunction.setDiscountAmount();
        LineItemFunction.setSubTotal();
        ReceiptFunction.addItem(LineItemFunction);
    }
    public void finalizeSale(){
        ReceiptFunction.printReceipt();
    }
 
}
