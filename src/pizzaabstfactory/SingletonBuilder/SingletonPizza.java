/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaabstfactory.SingletonBuilder;

import pizzaabstfactory.pizza.Pizza;
import pizzaabstfactory.pizzaBuilder.BuilderMargarita;
import pizzaabstfactory.pizzaBuilder.PizzaBuilder;

/**
 *
 * @author Dad
 */
public final class SingletonPizza {
    private static volatile Pizza pizza;
    private SingletonPizza(){}
    public static Pizza Inst()
    {
        if (null == SingletonPizza.pizza)
        {
            synchronized(SingletonPizza.class)
            {
                if (null == SingletonPizza.pizza)
                {
                    SingletonPizza.pizza = PizzaBuilder.Create(new BuilderMargarita());
                }
            }
        }
        return SingletonPizza.pizza;
    }
}
