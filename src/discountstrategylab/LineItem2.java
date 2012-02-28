/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author knangle
 */

// This is Lombardo's version of LineItem
public class LineItem2 {
    private Product2 product;
    private double qty;

    // fake database
    public static Product2[] productDb = {
        new Product2("A100", "Hat", 19.95, new NoDiscount()),
        new Product2("B100", "Glove", 29.95, new SpringProjectsDiscount()),
        new Product2("C100", "Belt", 39.95, new BuyOneGetOneDiscount())
    };
    
    private double getSubTotal() {
        return qty * product.getUnitCost() - product.getDiscount().getDiscount(qty, qty);
    }
    
    public String getLineItemInfo() {
        return product.getProdId() + " " + product.getDesc() + " "
                + product.getUnitCost() + " " + qty ;
    }
    
    public LineItem2(String prodId, double qty) {
        this.qty = qty;
        product = findProductById(prodId);
    }
    
    private Product2 findProductById(String id) {
        Product2 product = null;
        
        for(Product2 p : productDb) {
            if(id.equals(p.getProdId())) {
                product = p;
                break;
            }
        }
        return product;
    }
    

}
