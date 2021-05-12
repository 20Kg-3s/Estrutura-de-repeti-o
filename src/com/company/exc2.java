package com.company;

import java.util.Scanner;

public class exc2 {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu usuário: ");
        String user = sc.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();

        while ( user.equalsIgnoreCase(senha)){
            System.out.println("ERRO! sua senha e seu usuário não podem ser iguais. ");
            System.out.println("Digite seu usuário:");
            user = sc.next();
            System.out.println("Digite sua senha:");
            senha = sc.next();

        }
        System.out.println("Cadastro concluido!");
    }
}
