/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaabstfactory;

import pizzaabstfactory.SingletonBuilder.SingletonPizza;
import pizzaabstfactory.pizza.PizzaEnum;
import pizzaabstfactory.pizzaFactory.PizzaMarinara;
import pizzaabstfactory.pizza.Pizza;
import pizzaabstfactory.pizzaBuilder.BuilderMargarita;
import pizzaabstfactory.pizzaBuilder.PizzaBuilder;
import pizzaabstfactory.pizzaFactory.PizzaMozarella;
/**
 *
 * @author Dad
 */
public class PizzaAbstFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Создание пиццы черезабстрактнуюфабрику
        Pizza Margarita = new Pizza(new PizzaMarinara());
        Pizza Mozarella = new Pizza(new PizzaMozarella());
        
        Margarita.Info();
        Mozarella.Info();
        
        // Создание пиццы черезшаблонный метод
        Pizza.CreatePizza(PizzaEnum.MARGARITA).Info();
        
        // Шаблоный метод вперечеслении
        PizzaEnum.MARINARA.Create().Info();
        
        //Строитель произвольной пиццы
        System.out.println("Pizza Builder ");
        PizzaBuilder.Create(new BuilderMargarita()).Info();
        
        //Синглетон пиццы
        System.out.println("Синглетон пиццы");
        SingletonPizza.Inst().Info();
    }
    
}
