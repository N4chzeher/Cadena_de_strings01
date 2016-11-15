package com.company;

// Escriure un programa en llenguatge Java on es demani una paraula per teclat, després es
// demani una altra paraula per teclat, i es mostri per pantalla si les dues paraules escrites per
// l’usuari són iguals.

import java.util.Scanner;

public class EX02 {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra: ");
        String pal = scanner.next();


        System.out.println("Ingresa otra palabra: ");
        String pal2 = scanner.next();

        boolean iguales=false;

        if (pal.equals(pal2)){

            iguales=true;
        }

        else {
            iguales=false;
        }

        System.out.println(iguales);
    }
}
