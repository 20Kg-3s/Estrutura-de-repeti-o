package com.company;

import java.util.Scanner;

public class exc7 {
    public static void main(String[] args){
        Float numinput, maior;
        int contador = 2;

        Scanner sc = new Scanner(System.in);

        System.out.println("numero 1: ");
        numinput = sc.nextFloat();
        maior = numinput;

        while (contador <= 5){
            System.out.println("Numero " + contador + ": ");
            numinput = sc.nextFloat();

            if(numinput>maior){
                maior=numinput;
            }
            contador++;
        }
        System.out.println("O maior número digitado é: "+maior );
    }
}
