/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author knangle
 */
public class Spring2013Product{
 
    private DiscountStrategy DiscountStrategy1;
    private DiscountStrategy DiscountStrategy2;
    private DiscountStrategy DiscountStrategy3;
    
    public Spring2013Product (DiscountStrategy discount1, 
            DiscountStrategy discount2,DiscountStrategy discount3){
        this.DiscountStrategy1 = discount1;
        this.DiscountStrategy2 = discount2;
        this.DiscountStrategy3 = discount3;
    }
    public String getDescription(String productNo){
        return lookupProductDescription(productNo);
    }
    public double getUnitPrice(String productNo){    
        return Double.parseDouble(lookupProductUnitPrice(productNo));
    }
    public int getDiscountCode(String productNo){   
        return lookupProductDiscountCode(productNo);
    }
    public double getDiscountAmount(String productNo, double quantity){
        
        double discountAmount = 0;
         
        switch (this.getDiscountCode(productNo)){
           
            case 1:
                discountAmount = DiscountStrategy1.getDiscount(getUnitPrice
                        (productNo),quantity);
                break;
            case 2:
                discountAmount = DiscountStrategy2.getDiscount(getUnitPrice
                        (productNo),quantity);
                break;
            case 3:
                discountAmount = DiscountStrategy3.getDiscount(getUnitPrice
                        (productNo),quantity);
                break;
        }  
        return discountAmount;
    }
 // A discreet method to obtain the product description based on the product
 // number.  This method would be modified to query a database or file.
    private String lookupProductDescription(String prodno){
    String productDescription = "";
        for (int x = 0; x < productPriceArray.length;x++){
            if(productPriceArray[x][0].equals(prodno))
            productDescription = productPriceArray[x][1];
        }
    return productDescription;
     }
 // A discreet method to obtain the product price based on the product
 // number.  This method would be modified to query a database or file.
    private String lookupProductUnitPrice(String prodno){
    String productPrice = "";
        for (int x = 0; x < productPriceArray.length;x++){
            if(productPriceArray[x][0].equals(prodno))
            productPrice = productPriceArray[x][2];
        }
    return productPrice;
     }
     
 // A discreet method to obtain the product discount based on the product
 // number.  This method would be modified to query a database or file.
     private int lookupProductDiscountCode(String prodno){
        int productDiscount = 0;
           for (int x = 0; x < productPriceArray.length;x++){
            if(productPriceArray[x][0].equals(prodno))
            productDiscount = Integer.parseInt(productPriceArray[x][3]);
        }
    return productDiscount;
    }

     // Declare an array to hold product information - substitutes for database.
    private String[][] productPriceArray = {
                 {"C112234", "Carhartt duck jacket", "29.99","1"}
                ,{"H334456", "2 inch mending plate", ".29","1"}
                ,{"H334478", "3 inch stainless deck screws", "5.89","2"}
                ,{"L778812", "Rainmaster 50' garden hose", "24.99","2"}
                ,{"T665575", "Stanley #2 phillips screwdriver", "4.49","3"}};
    
}
