package com.company;

import java.util.Scanner;

public class exc1 {

    public static void main(String[] args) {
        Scanner sc = new  Scanner (System.in);
        System.out.println("insira um valor de 0 a 10: ");
        int nota = sc.nextInt();

        while (nota > 10 || nota < 0) {
            System.out.println("valor inválido ! Insira um valor válido");
            nota = sc.nextInt();
        }
        System.out.println("Nota Registrada com sucesso!");
    }
}
