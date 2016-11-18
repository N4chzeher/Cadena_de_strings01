package com.company;


import java.io.IOException;
import java.util.Scanner;

// Programa que llegeixi dos caràcters per teclat i comprovi si són iguals.
public class EX09 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un caractes:");

        char char1 = (char)System.in.read();

        System.in.read();

        System.out.println("Ingrese otro caractes:");

        char char2 = (char)System.in.read();

        if ( char1 == char2){
            System.out.println("Los caracteres son iguales!");
        }

        else {

            System.out.println("Los caracteres son diferentes");
        }




    }

}
