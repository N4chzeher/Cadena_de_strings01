package com.company;

// Programa que llegeixi un caràcter per teclat i comprovi si és una lletra majúscula.

import java.io.IOException;
import java.util.Scanner;
import java.util.StringJoiner;

public class EX08 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una letra:");
        char  let =(char)System.in.read();


        if(Character.isUpperCase(let)) {
            System.out.println(let + " Es mayucula");
        }

        else{
            System.out.println(let+" Es minuscula");
        }

    }
}
