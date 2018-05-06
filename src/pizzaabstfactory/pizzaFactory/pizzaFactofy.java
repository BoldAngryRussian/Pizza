/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaabstfactory.pizzaFactory;
import pizzaabstfactory.dough.Dough;
import pizzaabstfactory.cheese.Cheese;
import pizzaabstfactory.sausage.Sousage;


/**
 *
 * @author Dad
 */
public abstract class pizzaFactofy 
{
    public abstract Dough CreateDough();
    public abstract Cheese CreateCheese();
    public abstract Sousage CreateSousage();
    
    
}


