package br.com.meli;

import java.util.Scanner;

public class exec4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros a ser mostrados: ");
        int numero = scan.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (isPrime(i)) {
                    System.out.println(i + " é primo");
            };
        }



    }


    public static boolean isPrime(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero + 1; i++ ) {
            if (numero% i == 0) {
                contador = contador + 1;
            }
        }

        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }


}
