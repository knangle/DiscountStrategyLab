/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountStrategyLab2;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class RetailReceipt implements Receipt{
    
    private Customer customer;
    private LineItem item;
    private double totalSale = 0;
    
    public RetailReceipt(){}
    
    public void beginSale(String custNo){
        RetailCustomer customer = new RetailCustomer();
            this.customer = customer;
            customer.buildCustomer(custNo);
    }
    
    // Declare array list to store line items
    private ArrayList<LineItem> newReceipt = new ArrayList<LineItem>();

    public void addItem(String productID, double qty){
        RetailLineItem item = new RetailLineItem(productID, qty);
        this.item = item;
        newReceipt.add(item); 
    }
    public void printReceipt(){
        // Print receipt header
        System.out.println("***************************************MENARDS*****"
                + "**********************************");
        System.out.println("");
        if(customer.getCustomerName().length() > 0){
            System.out.println("Welcome back " + customer.getCustomerName());
            System.out.println("Purchase charged to card ending in " 
                    + customer.getCustomerNumber());
        }
        System.out.println(""); 
        System.out.println("                                               "
                + "       Unit                    Extended");
        System.out.println("Item No.  Description                          "
                + "Qty.   Price      Discount     Price");
        System.out.println("-----------------------------------------------"
                + "---------------------------------------");
        
        // Print receipt line items
        for (int x = 0; x < newReceipt.size(); x++){
            LineItem item = (LineItem)newReceipt.get(x);
            System.out.printf("%-9s %-33s %5.0f %9.2f %12.2f %10.2f\n",
                     item.getProductID(), item.getDescription(),
                     item.getQuantity(),item.getUnitPrice(),
                     item.getDiscountAmt(),item.getSubTotal());
            totalSale += item.getSubTotal();
        }
        
        // Print receipt trailer
        System.out.println("-----------------------------------------------"
                + "---------------------------------------");
        System.out.printf("                                                "
                + "             Total Sale:   %8.2f",totalSale);
        System.out.println(""); 
}
}