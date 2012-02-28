/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author Kevin
 */
public class RetailLineItem implements LineItem{
    private double qty;
    private Product product;
    
    private String productNumber;
    private String productDescription;
    private double unitPrice;
    private double quantity;
    private double discountAmount;
    private double subTotal;
    
    private Product ProductFunction;
    
    public RetailLineItem (Product product){
        this.ProductFunction = product;
        
    }
    public final void setProductNumber(String productNumber){
        this.productNumber = productNumber;
    }
    public final void setProductDescription(String productDescription){
       // this.productDescription = ProductFunction.getDescription(productNumber);
    }
    public final void setQuantity(double quantity){
        this.quantity = quantity;
    }
    public final void  setUnitPrice(){
      //  unitPrice = ProductFunction.getUnitPrice(productNumber);
    }
    public final void setDiscountAmount(){
     //  discountAmount = ProductFunction.getDiscountAmount(productNumber, 
      //         quantity);
    }
    public final void setSubTotal(){    
        subTotal = quantity * unitPrice + discountAmount;
    }
    public final String getProductNumber(){
        return productNumber;
    }
    public final String getProductDescription(){
        return productDescription;
    }
    public final double getQuantity(){
        return quantity;
    }
    public final double getUnitPrice(){
        return unitPrice;
    }
    public final double getDiscountAmount(){
        return discountAmount;
    }
    public final double getSubTotal(){
        return subTotal;
    }
}
