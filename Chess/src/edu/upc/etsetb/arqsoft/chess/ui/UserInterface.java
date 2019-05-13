/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.ui;

import edu.upc.etsetb.arqsoft.chess.services.ProtocolManager;
import edu.upc.etsetb.arqsoft.chess.ui.text.BoardTextUI;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author JuanCarlos
 */
public class UserInterface {

    private static ProtocolManager protocol;

    public UserInterface(){
        this.protocol = new ProtocolManager(this);
    }
    
    public static void main(String[] args) {
        /*
        Este código debería ser sustituido por código que presente un menú 
        de opciones al usuario y gestione las interacciones con el mismo.
        Ahora se limita a generar un Tablero textual y presentarlo por consola.
         */

        UserInterface ui = new UserInterface();
        
        BoardTextUI boardText = new BoardTextUI(true);
        boolean end = false;
        Scanner scanner = new Scanner(System.in);
        
        while (!end) {
            System.out.println("Introducir coordenadas del movimiento (Ejemplo: M:2,1:3,1): ");
            String user_input = scanner.nextLine();

            //Vamos a obtener el movimiento y las casillas
            String[] input = user_input.split(":");
            String tipo = input[0];
            String posiciones_inicio = input[1];
            String posiciones_fin = input[2];

            //Volvemos a parsear para obtener los valores f1,c1 y f2,c2
            String[] inicio = posiciones_inicio.split(",");
            int f1 = Integer.parseInt(inicio[0]);
            int c1 = Integer.parseInt(inicio[1]);
            String[] fin = posiciones_fin.split(",");
            int f2 = Integer.parseInt(fin[0]);
            int c2 = Integer.parseInt(fin[1]);

            switch (tipo) {
                case "M":
                    ui.getProtocolManager().move(f1, c1, f2, c2);
                    break;
                default:
                    end=true;
            }
        }
        scanner.close();
    }

    public void printMessage(String str) {
        System.out.print(str);
    }

    public void printlnMessage(String str) {
        System.out.println(str);
    }
    
    public ProtocolManager getProtocolManager(){
        return this.protocol;
    }
}