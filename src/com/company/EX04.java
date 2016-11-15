package com.company;

import java.util.Scanner;

// Escriure un programa en llenguatge Java on es demani una frase per teclat i es mostri per
// pantalla el nombre de caràcters que té aquella frase.

public class EX04 {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase: ");
        String fra1 = scanner.nextLine();

        System.out.println(fra1.length());

    }
}