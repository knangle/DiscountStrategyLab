/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountStrategyLab2;

/**
 *
 * @author Kevin
 */
public class Startup {

   
    public static void main(String[] args) {
       
        CashRegisterService cashRegister = new CashRegisterService();
        
        cashRegister.startNewSale("4692");

        cashRegister.addProduct("C112234", 2);
        
        cashRegister.addProduct("T665575", 1);
        
        cashRegister.addProduct("H334456", 4);
        
        cashRegister.addProduct("H334478", 3);
         
        cashRegister.addProduct("L778812", 2);
        
        cashRegister.finalizeSale();
        
    }
}
