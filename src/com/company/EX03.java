package com.company;

import java.util.Scanner;

// Escriure un programa en llenguatge Java on es demani una frase per teclat, després es
// demani una altra frase per teclat, i es mostri per pantalla les dues frases juntes en una sola línia.
public class EX03 {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase: ");
        String fra1=scanner.nextLine();


        System.out.println("Ingresa otra frase: ");
        String fra2=scanner.nextLine();

        System.out.println(fra1+ " "+fra2);

    }
}
