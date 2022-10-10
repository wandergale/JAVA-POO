package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Carrinho;
import produtos.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Carrinho carrinho = new Carrinho();
		
		Produto p1 = new Produto("Mouse", 200.0);
		Produto p2 = new Produto("Teclado", 350.0);
		Produto p3 = new Produto("Fone", 100.0);
		Produto p4 = new Produto("Monitor", 1200.0);
		Produto p5 = new Produto("Controle", 500.0);
		
		
		carrinho.addProduto(p1);
		carrinho.addProduto(p2);
		carrinho.addProduto(p3);
	
		System.out.println("Produtos no carrinho: ");
		carrinho.getProducts();
		
		System.out.println("");
		System.out.printf("Valor total: $ %.2f%n", carrinho.totalCompra());
		
		
		
		sc.close();
	}

}
