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
public class systemPizzaEdge {
    
   int op;
    String border = "";
    double valorBorda;
    int validador = 0;
    systemPizzaOrder order = new systemPizzaOrder();

    public int validateSystem(int op) {
        switch (op) {
            case 1:
                orderEdge();
                validador = 1;
                break;
            case 2:

                break;
        }
        return 0;
    }

    public String orderEdge() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("ESCOLHA UM SABOR DE BORDA<<\n"
                + "#[1] - Cheddar#\n"
                + "#[2] - Catupiry#\n"
                + "#[3] - meia Nutella meia Doce de Leite#\n"
                + "#[4] - Nutella#\n"
                + "Insira aqui a borda da pizza: ");
        op = entrada.nextInt();

        switch (op) {
            case 1:
                border = "Cheddar";
                break;

            case 2:
                border = "Catupiry";
                break;

            case 3:
                border = "meia Nutella com meia Doce de Leite";
                valorBorda = 3;
                break;

            case 4:
                border = "Nutella";
                valorBorda = 2;
                break;
        }
        return border;
    }
}
