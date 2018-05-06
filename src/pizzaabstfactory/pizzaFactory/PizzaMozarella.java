/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaabstfactory.pizzaFactory;

import pizzaabstfactory.cheese.Cheese;
import pizzaabstfactory.cheese.CheeseMozarella;
import pizzaabstfactory.dough.Dough;
import pizzaabstfactory.dough.DoughThing;
import pizzaabstfactory.sausage.Sousage;
import pizzaabstfactory.sausage.SousageSalamy;

/**
 *
 * @author Dad
 */
public class PizzaMozarella extends pizzaFactofy
{

    @Override
    public Dough CreateDough() {
        return new DoughThing();
    }

    @Override
    public Cheese CreateCheese() {
       return new CheeseMozarella();
    }

    @Override
    public Sousage CreateSousage() {
        return new SousageSalamy();
    }
    
}
