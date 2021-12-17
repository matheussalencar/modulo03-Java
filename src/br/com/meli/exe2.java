package br.com.meli;
import java.util.Scanner;
public class exe2 {
    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros a ser mostrada");
        int numerosMostrados = scan.nextInt();
        System.out.println("Digite um multiplo qualquer");
        int m = scan.nextInt();
        int multiplos = m;
        for (int i = 0; i < numerosMostrados; i +=1) {
            System.out.println(multiplos);
            multiplos += m;
        }
    }
}
