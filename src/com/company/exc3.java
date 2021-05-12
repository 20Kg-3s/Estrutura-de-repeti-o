package com.company;

import java.util.Scanner;

public class exc3 {
    public static void main(String[] args){
        Scanner scnome = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scnome.nextLine();
        nome.length();

        //checar quantidade de caracteres do nome
        while ( nome.length() < 3){
            System.out.println("Muito curto! mínimo 3 caracteres.");
            nome = scnome.next();
        }

        Scanner scidade = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scidade.nextInt();

        //idade
        while( idade < 0 || idade > 150) {

            System.out.println("Valor inválido! Digite novamente.");
            idade = scidade.nextInt();

        }

        //salario
        Scanner scsalario = new Scanner(System.in);
        System.out.println("Digite seu salário:");
        double salario = scsalario.nextDouble();

        while (salario < 1) {
            System.out.println("valor inválido! Digite novamente.");
            salario = scsalario.nextDouble();
        }

        //genero
        Scanner scgen = new Scanner(System.in);
        System.out.println("Gênero: f = feminino, m = masculino");
        String gen = scgen.nextLine();
        while (!gen.equalsIgnoreCase("f") && !gen.equalsIgnoreCase ("m")) {
            System.out.println("Valor inválido! Digite novamente.");
            gen = scgen.nextLine();
        }

        //stts_civil
        Scanner scstts = new Scanner(System.in);
        System.out.println("estado civil: s= Solteiro/ c= Casado/ v= Viúvo/ d= Divorciado");
        String stts = scstts.nextLine();

        while( !stts.equalsIgnoreCase("s") & !stts.equalsIgnoreCase("c") & !stts.equalsIgnoreCase("v") & !stts.equalsIgnoreCase("d")) {
            System.out.println("valor inválido! Digite novamente");
            stts = scstts.nextLine();
        }
        System.out.println("Cadastro Concluido!");
    }
}
