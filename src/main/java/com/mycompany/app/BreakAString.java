package com.mycompany.app;

import java.util.Scanner;

/*
 * Write code that breaks any string into fixed-length chunks of 
 * 50 characters and print each of these chunks on a line.
*/

public class BreakAString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira uma string como argumento. ");
        String txt = scan.nextLine();
        scan.close();

        int tamanho = 10;
        int total = (int) Math.ceil((double) txt.length() / tamanho);

        for (int i = 0; i < total; i++) {
            int inicio = i * tamanho;
            int fim = Math.min(inicio + tamanho, txt.length());
            String pedaco = txt.substring(inicio, fim);
            System.out.println(pedaco);
        }
    }
}
