/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountStrategyLab3;

/**
 *
 * @author Kevin
 */
public class RetailLineItem implements LineItem{
    
    // Declare LineItem variables
    private double quantity;
    private Product product;
    
    public RetailLineItem(String productID, double quantity){
        this.quantity = quantity;
        this.product = findProduct(productID);
    }    
    // Build a fake product database
    
    public static Product[] productDatabase = {
        new Product("C112234", "Carhartt duck jacket", 29.99, SimpleDiscountFactory.createDiscount(1)),
        new Product("H334456", "2 inch mending plate", .29, SimpleDiscountFactory.createDiscount(1)),
        new Product("H334478", "3 inch stainless deck screws", 5.89, 
                    SimpleDiscountFactory.createDiscount(2)),
        new Product("L778812", "Rainmaster 50' garden hose", 24.99, 
                    SimpleDiscountFactory.createDiscount(2)),
        new Product("T665575", "Stanley #2 phillips screwdriver", 4.49, 
                    SimpleDiscountFactory.createDiscount(3))};
    
    // Select the product from the database
    private Product findProduct(String productID){
    Product product = null;
        
    for (Product p: productDatabase)
        if (productID.equals(p.getProductID())){
            product = p;
            break;
        }
    return product;
    }
    
    // Getters for LineItem data
    
        public String getProductID(){
            return product.getProductID();
        }
        
        public String getDescription(){
            return product.getDescription();
        }
        
        public double getUnitPrice(){
            return product.getUnitPrice();
        }
        
        public double getQuantity(){
            return quantity;
        }
        
        public double getDiscountAmt(){
            return product.getDiscount().getDiscountAmount(getUnitPrice(), 
                   quantity);
        }
        
        public double getSubTotal(){
            return quantity * getUnitPrice() + getDiscountAmt();
        }
        
}
