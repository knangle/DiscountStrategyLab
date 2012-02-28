/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountStrategyLab2;

/**
 *
 * @author Kevin
 */
public interface Customer {
    
    public void buildCustomer(String custNo);
    public String lookupCustomerName(String custNo);
    public String getCustomerName();
    public String getCustomerNumber();
}
