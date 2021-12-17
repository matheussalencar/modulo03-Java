package br.com.meli;
import java.util.Scanner;

public class exec3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        int numeroPrimo = scan.nextInt();

        for (int i = 1; i <= numeroPrimo; i++) {
            if (numeroPrimo % i == 0) {
                contador = contador+ 1;
            }
        }

        if (contador != 2) {
            System.out.println("O numero " + numeroPrimo + " Nao e primo");
        } else {
            System.out.println("é primo");
        }
    }
}
