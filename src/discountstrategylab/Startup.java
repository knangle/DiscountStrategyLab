/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author Kevin
 */
public class Startup {

   
    public static void main(String[] args) {
        
        
        DiscountStrategy discount1 = new NoDiscount();
        DiscountStrategy discount2 = new BuyOneGetOneDiscount();
        DiscountStrategy discount3 = new SpringProjectsDiscount();
        Spring2013Product currentProducts = new Spring2013Product(discount1,
                discount2, discount3);
       // Customer currentCustomer = new RetailCustomer();
       // Receipt customerReceipt = new RetailReceipt(currentCustomer);
       
      //  CashRegisterService cashRegister = new CashRegisterService(
     //           customerReceipt);
        
        //cashRegister.startNewSale("3412");
    //    cashRegister.startNewSale("4692");

//        LineItem item1 = new RetailLineItem(currentProducts);
//        cashRegister.addProduct("C112234", 2,item1);
//        LineItem item2 = new RetailLineItem(currentProducts);
//        cashRegister.addProduct("T665575", 1, item2);
//        LineItem item3 = new RetailLineItem(currentProducts);
//        cashRegister.addProduct("H334456", 4,item3);
//        LineItem item4 = new RetailLineItem(currentProducts);
//        cashRegister.addProduct("H334478", 1, item4);
//         LineItem item5 = new RetailLineItem(currentProducts);
//        cashRegister.addProduct("L778812", 2,item5);
//        
//        cashRegister.finalizeSale();
        
//    }
}
}