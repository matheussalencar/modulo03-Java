package br.com.meli;

import java.util.Scanner;

public class exec1 {

    public static void main(String[] args) {
        System.out.println("Digite aqui seu numero: ");
        Scanner scan;
        scan = new Scanner(System.in);
        int numeroInteiro = scan.nextInt();
        int numeroPar = 0;
        for (int i = 0; i < numeroInteiro; i += 1) {
            System.out.println(numeroPar);
            numeroPar += 2;
        }
    }
}
