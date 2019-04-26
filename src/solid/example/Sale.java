/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.example;

/**
 *
 * @author Lucas Wolfs <lwolfs@my.wctc.edu>
 */
public class Sale implements DiscountStrategy{
    private final double discountPercent = 0.1;

    
    @Override
    public double applyDiscount(double billAmount) {
        return billAmount - (billAmount * discountPercent);
    }

    @Override
    public String getDescription() {
        return "Sale";
    }
    
   
    
}
