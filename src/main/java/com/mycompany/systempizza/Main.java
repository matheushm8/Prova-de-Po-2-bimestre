
package com.mycompany.systempizza;

public class Main {
    
    public static void main(String[] args) {
       systemPizzaOrder order = new systemPizzaOrder();
       SystemPizzaSize size = new SystemPizzaSize();
       systemPizzaFlavor flavor = new systemPizzaFlavor();
       systemPizzaEdge edge = new systemPizzaEdge();
       systemDrink drink = new systemDrink();
        
   order.order();
    }
    
}