package br.com.generation.poo;

import java.util.Scanner;

public class TestaPatinete {

	public static void main(String[] args) {

	Patinete p = new Patinete ();
	Scanner leia = new Scanner (System.in);
	
	System.out.print("Qual é a cor do seu patinete? ");
	p.setCor(leia.next());
	
	System.out.print("Seu patinete é pequeno, medio ou grende? ");
	p.setTamanho(leia.next());
	
	System.out.println("Qual modelo do seu patinete?: ");
	p.setModelo(leia.next());
		
	System.out.println("Seu patinete é " + p.getCor() + ", tem " + p.getTamanho() + " de tamanho e o modelo dele é: " + p.getModelo());
	p.setModelo(leia.next());		
		
	leia.close();
	
	}

}
