package entities;

import java.util.ArrayList;

import produtos.Produto;

public class Carrinho implements Compra {
	
	ArrayList<Produto> produtos;
	private double valorTotal;
	
	public Carrinho() {
		produtos = new ArrayList<Produto>();
	}

	
	public void addProduto(Produto produto) {
		produtos.add(produto);
		valorTotal += produto.getPrice();
	}
	
	public void products() {
		for(Produto p : produtos) {
			System.out.println(p);
		}
	}
	
	public void getProducts() {
		for (Produto p : produtos) {
			System.out.printf(p.getName()+", valor: $ %.2f%n", p.getPrice());
		}
	}
	
	@Override
	public double totalCompra() {
		return valorTotal;
	}
}
