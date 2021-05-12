package com.company;

import java.util.Scanner;

public class exc8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double num, soma = 0;
        int contador = 0;

        do {
            System.out.println("Digite um número: ");
            num = sc.nextDouble();

            if (num >= 0) {
                 soma = num + soma;
                 contador++;
            }
        } while(num >= 0);
        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + soma / contador);

    }
}
