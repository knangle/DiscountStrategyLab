/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountStrategyLab3;

/**
 *
 * @author Kevin
 */
public class Product {
    
    private String productID;
    private String description;
    private double unitPrice;
    private DiscountStrategy discount;
    
    public Product (String productID, String description, double unitPrice, 
                    DiscountStrategy discount){
        this.productID = productID;
        this.description = description;
        this.unitPrice = unitPrice;
        this.discount = discount;
        
    }

    public String getDescription() {
        return description;
    }

    public String getProductID() {
        return productID;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
    
    public DiscountStrategy getDiscount(){
        return discount;
    }

}
