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
public interface DiscountStrategy {
    public double applyDiscount(double billAmount);
    public String getDescription();
}
