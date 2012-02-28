/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author Kevin
 */

// This is my new Product class.  I have no interface now because this isn't 
// changing
public class Product {
    
    private String productNumber;
    private String productDescription;
    private double unitCost;
    private DiscountStrategy discount;

    public Product(String productNumber, String description, double unitCost, 
            DiscountStrategy discount) {
        this.productNumber = productNumber;
        this.productDescription = description;
        this.unitCost = unitCost;
        this.discount = discount;
    }
    
   
    public String getDescription() {
        return productDescription;
    }

    public void setDescription(String description) {
        this.productDescription = description;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
}
