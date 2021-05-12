package com.company;

import java.util.Scanner;

public class exc5 {
    public static void main(String[] args){
        int ano = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a população do país A e a taxa de crescimento em %:");
        double a = sc.nextDouble();
        double taxa = sc.nextDouble() / 100 ;
        System.out.println("Digite a população do país B e a taxa de crescimento em %:");
        double b = sc.nextDouble();
        double taxb = sc.nextDouble() / 100;

        while (a <= b) {
            a += a * taxa;
            b += b * taxb;
            ano += 1;
        }
        System.out.println("O país A ultrapassa ou a iguala a B em "+ano+ " anos.");

    }

}
