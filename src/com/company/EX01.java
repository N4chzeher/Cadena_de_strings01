package com.company;

// Escriure un programa en llenguatge Java on es demani una paraula per teclat i es mostri per
// pantalla només la primera lletra de la paraula que ha introduït l’usuari. Ex01.java

import java.util.Scanner;

public class EX01 {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra: ");
        String pal = scanner.next();

        System.out.println(pal.charAt(0));



    }


}
