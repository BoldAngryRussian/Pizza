/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaabstfactory.pizzaFactory;

import pizzaabstfactory.cheese.Cheese;

import pizzaabstfactory.cheese.CheeseSuluguny;
import pizzaabstfactory.dough.Dough;
import pizzaabstfactory.dough.DoughFat;

import pizzaabstfactory.sausage.Sousage;
import pizzaabstfactory.sausage.SousageFry;


/**
 *
 * @author Dad
 */
public class PizzaMarinara extends pizzaFactofy {
        @Override
    public Dough CreateDough() {
        return new DoughFat();
    }

    @Override
    public Cheese CreateCheese() {
       return new CheeseSuluguny();
    }

    @Override
    public Sousage CreateSousage() {
        return new SousageFry();
    }
}
