package br.com.meli.vetor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exec2Vector {
    /* Exercício 3: Para um protótipo de supermercado, crie um programa que leia 3 produtos e
        imprima no console: nome, preço, quantidade e o valor total da compra. Utilize um array como
        estrutura de dados para armazenamento dos produtos informados. 
    */

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<Produto>();
        Scanner scan = new Scanner(System.in);
        Float total = 0f;
        System.out.println("----- Carrinho de compras -------");
        for (int i = 0; i < 3; i++ ) {
            Produto produto = new Produto();
            System.out.println("Digite o nome do produto ");
            String nome = scan.next();
            produto.setNome(nome);
            System.out.println("Digite o preco do produto ") ;
            Float preco = scan.nextFloat();
            produto.setPreco(preco);
            System.out.println("Digite a quantidade do produto ");
            Integer quantidade = scan.nextInt();
            produto.setQuantidade(quantidade);

            produtos.add(produto);

            total = total + ( produto.getQuantidade() * produto.getPreco());
        }
        
        for (int i = 0; i < produtos.size(); i ++) {
            System.out.println("\n");
            System.out.println("Produto " + ((i) + 1));
            System.out.println(produtos.get(i).getNome());
            System.out.println("R$" + produtos.get(i).getPreco());
            System.out.println("Quantidade: " + produtos.get(i).getQuantidade());
            System.out.println("\n");
        }

        System.out.println("Valor Total: R$" + total);
    }


}
