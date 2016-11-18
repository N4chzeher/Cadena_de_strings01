package com.company;

// Escriure un programa en llenguatge Java on es demani una frase per teclat i es mostri per
// pantalla amb tots els caràcters en lletra majúscula.

import java.util.Scanner;

public class EX07 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.printf("Ingresa una frase: ");
        String fra1=scanner.nextLine();

        System.out.printf(fra1.toUpperCase());
    }
}
