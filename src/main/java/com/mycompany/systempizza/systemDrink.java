/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.systempizza;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class systemDrink {
    
   int op;
    String drink = "";
    double valorDrink;
    int validador = 1;
    ArrayList<String> listaBebidas = new ArrayList();

    public int systemValidateDrink(int op) {

       switch (op) {
            case 1:
                systemOrderDrink();
                break;
            case 2:
                validador = validador - 1;
                break;
        }
        return 0;
    }

    public ArrayList systemOrderDrink() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("ESCOLHA UMA BEBIDA\n"
                + "#[1] - Coca Cola 2 lt\n"
                + "#[2] - Cerveja Heineken 330 ml\n"
                + "#[3] - Suco Pratz 900 ml\n"
                + "#[4] - Agua Mineral 600 ml\n"
                + "Insira aqui uma bebida: ");
        op = entrada.nextInt();

        switch (op) {
            case 1:
                listaBebidas.add("Coca Cola-2lt");
                valorDrink = valorDrink + 9.5;
                break;

            case 2:
                listaBebidas.add("Cerveja Heineken 330ml");
                valorDrink = valorDrink + 6.5;
                break;

            case 3:
                listaBebidas.add("Suco Pratz 900ml");
                valorDrink = valorDrink + 12.5;
                break;

            case 4:
                listaBebidas.add("Agua Mineral600 ml");
                valorDrink = valorDrink + 3.5;
                break;
        }

        return listaBebidas;

    }

}
