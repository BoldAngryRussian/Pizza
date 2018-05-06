/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaabstfactory.pizzaBuilder;

import pizzaabstfactory.cheese.CheeseMozarella;
import pizzaabstfactory.cheese.CheeseSuluguny;
import pizzaabstfactory.dough.DoughFat;
import pizzaabstfactory.dough.DoughThing;
import pizzaabstfactory.sausage.SousageBoild;
import pizzaabstfactory.sausage.SousageSalamy;

/**
 *
 * @author Dad
 */
public class BuildMarinara extends PizzaBuilder{
    
    @Override
    protected void BuildDough() {
        mPizza.SetDough(new DoughThing());
    }

    @Override
    protected void BuildCheese() {
        mPizza.SetCheese(new CheeseSuluguny());
    }

    @Override
    protected void BuildSausage() {
        mPizza.SetSausage(new SousageBoild());
    }
    
}
