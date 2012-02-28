/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author knangle
 */

// This is Lombardo's version of Product
public class Product2 {
    private String prodId;
    private String desc;
    private double unitCost;
    private DiscountStrategy discount;

    public Product2(String prodId, String desc, double unitCost, DiscountStrategy discount) {
        this.prodId = prodId;
        this.desc = desc;
        this.unitCost = unitCost;
        this.discount = discount;
    }
    
   
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
}
