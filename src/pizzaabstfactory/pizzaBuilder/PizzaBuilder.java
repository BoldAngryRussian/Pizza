/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaabstfactory.pizzaBuilder;

import pizzaabstfactory.pizza.Pizza;
import pizzaabstfactory.pizza.PizzaEnum;

/**
 *
 * @author Dad
 * Строитель произвольной пиццы
 */
public abstract class PizzaBuilder {
    final protected Pizza mPizza;
    public PizzaBuilder()
    {
        // Пицца по-умолчанию
        mPizza = Pizza.CreatePizza(PizzaEnum.MARGARITA);
    }
    protected abstract void BuildDough();
    protected abstract void BuildCheese();
    protected abstract void BuildSausage();
    
    static public Pizza Create(PizzaBuilder builder)
    {
        return builder.Build();
    }
    
    public Pizza Build()
    {
        BuildDough();
        BuildCheese();
        BuildSausage();
        
        return mPizza;
    }
}
