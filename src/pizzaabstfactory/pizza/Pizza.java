/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaabstfactory.pizza;

import pizzaabstfactory.cheese.Cheese;
import pizzaabstfactory.dough.Dough;
import pizzaabstfactory.pizzaFactory.PizzaMarinara;
import pizzaabstfactory.pizzaFactory.PizzaMozarella;
import pizzaabstfactory.pizzaFactory.pizzaFactofy;
import pizzaabstfactory.sausage.Sousage;

/**
 *
 * @author Dad
 */
public class Pizza {
    private Cheese mCheese;
    private Dough mDough;
    private Sousage mSousage;
    public Pizza(pizzaFactofy factory)
    {
        mDough  =   factory.CreateDough();
        mCheese =   factory.CreateCheese();
        mSousage =   factory.CreateSousage();
    }
    static public Pizza CreatePizza(PizzaEnum PizzaType)
    {
        System.out.println("Template method: ");
        switch(PizzaType)
        {
            case MARGARITA: return new Pizza(new PizzaMozarella());
            case MARINARA:  return new Pizza(new PizzaMarinara());
            default: return new Pizza(new PizzaMarinara());
        }
        
    }
    public void Info()
    {
        System.out.println("Pizza info: ");
        mDough.Info();
        mCheese.Info();
        mSousage.Info();
        System.out.println("-----------------------------");
    }
    public void SetDough(Dough mDough)
    {
        this.mDough = mDough;
    }
    public void SetCheese(Cheese mCheese)
    {
        this.mCheese = mCheese;
    }
    public void SetSausage(Sousage mSousage)
    {
        this.mSousage = mSousage;
    }
}
