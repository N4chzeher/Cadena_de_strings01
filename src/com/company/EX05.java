package com.company;

import java.util.Scanner;

// Escriure un programa en llenguatge Java on es demani una frase per teclat i es mostri per
// pantalla la mateixa frase canviant tots els caràcters “a” per “e”.
public class EX05 {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra: ");
        String fra1 = scanner.nextLine();


        System.out.println(fra1.replace('a', 'e'));

    }



}
