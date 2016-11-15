package com.company;

// Escriure un programa en llenguatge Java on es demani una frase per teclat i es mostri per
// pantalla amb tots els caràcters en lletra minúscula.

import java.util.Scanner;
import java.util.StringJoiner;

public class EX06 {

    public static void main (String [] args){

        Scanner scanner=new Scanner(System.in);
        System.out.printf("Ingresa una frase: ");
        String fra1=scanner.nextLine();

        System.out.printf(fra1.toLowerCase());
    }

}
