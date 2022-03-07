package br.com.generation.poo;

public class Eletronico {

	private String FonteEnergia;
	private String nome;
	private String cor;
	public String getFonteEnergia() {
		return FonteEnergia;
	}
	public void setFonteEnergia(String fonteEnergia) {
		FonteEnergia = fonteEnergia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	void liga() {
		System.out.println("O "+nome+" está ligando");
	}
	void desliga() {
		System.out.println("O "+nome+" está desligando");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
