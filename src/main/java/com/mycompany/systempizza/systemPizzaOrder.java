/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.systempizza;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class systemPizzaOrder {
    

    int x = 0;
    double valorTotal;

    public static void printMessage() {
        
        System.out.println("PIZZARIA DO MARQUES");
        System.out.println("Olá, é um prazer atendeló(A)!");
        
    }

    public void order() {
        printMessage();
        SystemPizzaSize pizzaSise = new SystemPizzaSize();
        systemPizzaFlavor flavor = new systemPizzaFlavor();
        systemPizzaEdge pizzaEdge = new systemPizzaEdge();
        systemDrink drink = new systemDrink();

        Scanner entrada = new Scanner(System.in);

        System.out.println("#SELECIONE UM TAMANHO DE PIZZA# \n"
                + "Tamanhos      valor sem borda e com borda "
                + "#[1] - Gigante       R$75        R$80    \n"
                + "#[2] - Familia       R$66        R$69.50 \n"
                + "#[3] - Media         R$52        R$56.50  \n"      
                + "#[4] - Pequena       R$42        R$44.50   \n"    
                + "#[5] - Broto         R$28     Não disponivel\n"      
                + "Insira aqui o tamanho da pizza: ");
        pizzaSise.systemOrderSize(entrada.nextInt());

        while (x < pizzaSise.qntSabores) {
            Scanner entrada2 = new Scanner(System.in);

            System.out.println(">>SELECIONE UM SABOR DE PIZZA<<\n"
                    + "#[1] - 5 Queijos\n"
                    + "#[2] - Frango Catupiry\n"
                    + "#[3] - Cheddar  R$3.50 \n"
                    + "#[4] - Calabresa\n"
                    + "#[5] - Chocolate\n"
                    + "#[6] - Prestigio\n"
                    + "#[7] - Salmao com alcaparras R$4.00\n"
                    + "#[8] - Camarao   R$4.50\n"
                    + "#[9] - Abacaxi com Canela\n"
                    + "Escolha aqui o sabor da pizza: ");
            flavor.systemOrderFlavor(entrada2.nextInt());
            x++;
        }

        if (pizzaSise.validador == 0) {
            Scanner entrada3 = new Scanner(System.in);
            System.out.println("Gostaria de acompanhamentos de borda ?\n"
                    + "#[1] - Sim\n"
                    + "#[2] - Nao");
            pizzaEdge.validateSystem(entrada3.nextInt());
        } else {

        }

        double valor;
        if (pizzaEdge.validador == 1) {
            valor = pizzaSise.valorCborda;
        } else {
            valor = pizzaSise.valorTamanho;
        }

        while (drink.validador == 1) {
            Scanner entrada4 = new Scanner(System.in);
            System.out.println("Gostaria escolher alguma bebida hoje?\n"
                    + "#[1] - Sim#\n"
                    + "#[2] - Nao#");
            drink.systemValidateDrink(entrada4.nextInt());
        }

        valorTotal = valor + flavor.valorSabor + pizzaEdge.valorBorda + drink.valorDrink;

        System.out.println("O tamanho da pizza é: " + pizzaSise.tamanho);
        System.out.println("Os sabores selecionados foram: " + flavor.listaSabores);
        System.out.println("A borda escolhida foi: " + pizzaEdge.border);
        System.out.println("A(s) bebida(s) de sua ecolha foi: " + drink.listaBebidas);
        System.out.println("O total do seu pedido foi de :R$" + valorTotal);

    }
}