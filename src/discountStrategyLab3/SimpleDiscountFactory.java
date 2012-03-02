/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountStrategyLab3;

/**
 *
 * @author Kevin
 */
public class SimpleDiscountFactory {
    
    private static SimpleDiscountFactory instance;
    
    private SimpleDiscountFactory(){
    }
    
    public static SimpleDiscountFactory getInstance(){
        
        if(instance == null){
            instance = new SimpleDiscountFactory();
        }
    return instance;
    }
    
    public DiscountStrategy createDiscount(int selectDiscount){
        DiscountStrategy discount = null;
        
        switch (selectDiscount){
        
            case 2:
                discount = new BuyOneGetOneDiscount();
                break;
            case 3:
                discount = new SpringProjectsDiscount();
                break;
            default:
                discount = new NoDiscount();
        }

        return discount;
    }
    
}
