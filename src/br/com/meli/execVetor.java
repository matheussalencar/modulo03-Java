package br.com.meli;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class execVetor {

public static void main(String[] args) {
    Integer[] array = {52, 10, 85, 1324, 01, 13,62, 30, 12 ,127};
    System.out.println("Array em ordem crescente");
    Arrays.sort(array);
    for (int numero: array)
        System.out.println(numero);

    System.out.println("\n");

    System.out.println("Array em ordem descrescente");
    Arrays.sort(array, Collections.reverseOrder());
    for (int numero: array)
        System.out.println(numero);

   
}


}