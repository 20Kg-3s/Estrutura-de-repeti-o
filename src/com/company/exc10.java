package com.company;

import java.util.Scanner;

public class exc10 {
    public static void main(String[] args){
        //Faça um programa que receba dois números inteiros
        // e gere os números inteiros que estão no intervalo compreendido por eles.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        while (num1<num2){
            num1 ++;
            System.out.print(num1 + " ");
        }

        while (num2<num1){
            num1--;
            System.out.print(num1 + " ");
        }
    }
}
