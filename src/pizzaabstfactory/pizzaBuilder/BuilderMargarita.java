/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaabstfactory.pizzaBuilder;

import pizzaabstfactory.cheese.CheeseMozarella;
import pizzaabstfactory.dough.DoughFat;
import pizzaabstfactory.sausage.SousageSalamy;

/**
 *
 * @author Dad
 */
public class BuilderMargarita extends PizzaBuilder{

    @Override
    protected void BuildDough() {
        mPizza.SetDough(new DoughFat());
    }

    @Override
    protected void BuildCheese() {
        mPizza.SetCheese(new CheeseMozarella());
    }

    @Override
    protected void BuildSausage() {
        mPizza.SetSausage(new SousageSalamy());
    }
    
}
