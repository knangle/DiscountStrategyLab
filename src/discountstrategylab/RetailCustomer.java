/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author Kevin
 */
public class RetailCustomer implements Customer{
    
    private String customerName;
    private String customerNumber;
    
    public String getCustomerName(){
        return customerName;
    }
    public String getCustomerNumber(){
        return customerNumber;
    }
    public void buildCustomer(String custNo){
        this.customerNumber = custNo;
        customerName = lookupCustomerName(custNo);   
    }
    public String lookupCustomerName(String custNo){
        String customerName = "";
            for (int x = 0; x < custArray.length;x++){
                if(custArray[x][0].equals(custNo))
                customerName = custArray[x][1];
            }
        return customerName;
    }
    
    // Declare an array to hold customer information - substitutes for database.
    private String[][] custArray = {{"5678", "Pat Hand"},{"4439", "Phil R. Upp"}
            ,{"9922", "Claude Duvalier"},{"5698","Marie Curie"}
            ,{"6970", "Donna Stone"},{"3685", "Leslie Nielson"}
            ,{"4460", "Joyce Parmalee"},{"7010", "Leigh Wallace"}
            ,{"4692", "Dexter Manly"},{"3412", "Walter Payton"}};
    
}
