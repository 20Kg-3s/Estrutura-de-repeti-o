package com.company;

public class exc4 {
    public static void main(String[] args){
        int a = 80000, b= 200000, ano = 0;

        while (a<=b) {
            a += a * 0.03;
            b += b * 0.015;
            ano += 1;
        }
        System.out.println("O país A ultrapassa ou a iguala a B em "+ano+ " anos.");

    }

}
