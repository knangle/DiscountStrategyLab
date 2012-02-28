/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author knangle
 */
// This is my new version of LineItem
public class RetailLineItem2 {
    private Product product;
    private double qty;

    // fake product database
    public static Product[] productDatabase = {
        new Product("A100", "Hat", 19.95, new NoDiscount()),
        new Product("B100", "Glove", 29.95, new SpringProjectsDiscount()),
        new Product("C100", "Belt", 39.95, new BuyOneGetOneDiscount())
    };
    
    private double getSubTotal() {
        return qty * product.getUnitCost() - product.getDiscount().getDiscount(product.getUnitCost(), qty);
    }
    
//    public String getLineItemInfo() {
//        return product.getProductNumber() + " " + product.getDescription() + " "
//                + product.getUnitCost() + " " + qty ;
//    }

    
    private Product findProductByNumber(String id) {
        Product product = null;
        
        for(Product p : productDatabase) {
            if(id.equals(p.getProductNumber())) {
                product = p;
                break;
            }
        }
        return product;
    }
    

}
