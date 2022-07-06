package model;

import java.math.BigDecimal;

public class Item {
	
	private String nome;
	private String sobre;
	private BigDecimal preco;
	private String categoria;
	
	// construtor
	public Item(String nome, String sobre, BigDecimal preco, String categoria){
		this.nome = nome;
		this.sobre = sobre;
		this.preco = preco;
		this.categoria = categoria;
	}
	
	// getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobre() {
		return sobre;
	}
	public void setSobre(String sobre) {
		this.sobre = sobre;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return  "Nome do Item: " + getNome() + " || " + "Valor: " +getPreco()  + " || " + "Categoria: " + getCategoria() + "\n";
	}
	
	
}
