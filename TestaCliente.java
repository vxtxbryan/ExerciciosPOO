package br.com.generation.poo;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {

	Scanner entrada = new Scanner (System.in);
	
	System.out.println("Qual nome do cliente?: ");	
	String NomeCliente = entrada.next();
	
	System.out.println("Quantos anos o cliente possui?: ");
	String IdadeCliente = entrada.next();
		
	System.out.println("Número do documento do cliente. RG/CPF?: ");
	String IdentidadeCliente = entrada.next();
	
	Cliente c1 = new Cliente();
		
	 c1.setNomeCliente(NomeCliente);
	 c1.setIdadeCliente(IdadeCliente);
	 c1.setIdentidadeCliente(IdentidadeCliente);
	 c1.setValor(350);
	 
	 System.out.println("Nome do cliente: " + c1.getNomeCliente());
	 System.out.println("Idade do cliente: " + c1.getIdadeCliente());
	 System.out.println("Identidade do cliente: " + c1.getIdentidadeCliente());
	 System.out.println("Valor gasto na compra: R$" + c1.getValor());

		
		
	entrada.close();	
	}

}
