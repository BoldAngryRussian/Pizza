/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaabstfactory.pizza;
import pizzaabstfactory.pizzaFactory.PizzaMarinara;
import pizzaabstfactory.pizzaFactory.PizzaMozarella;
/**
 *
 * @author Dad
 */
public enum PizzaEnum {
    MARGARITA,
    MARINARA;
    public Pizza Create()
    {
        System.out.println("Creation from enum:");
        switch(this)
        {
            case MARGARITA: 
                return new Pizza(new PizzaMozarella());
            case MARINARA:  
                return new Pizza(new PizzaMarinara());
            default: 
                return new Pizza(new PizzaMarinara());
        }
    }
}
