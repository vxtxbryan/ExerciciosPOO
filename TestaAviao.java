package br.com.generation.poo;

import java.util.Scanner;

public class TestaAviao {

	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	
    System.out.println("Digite o nome do passageiro: ");
    String Passageiro = entrada.next();		
    
    System.out.println("Digite o número do seu passaporte: ");
    String Passaporte = entrada.next();		
    
    System.out.println("Digite o número do seu RG: ");
    String RG = entrada.next();
    
    System.out.println("Digite o local de origem: ");
    String Origem = entrada.next();
    
    System.out.println("Digite o local de destino desejado: ");
    String Destino = entrada.next();
    
    System.out.println("Digite a data de saida: ");
    String DataSaida = entrada.next();
    
    System.out.println("Digite a data de volta: ");
    String DataVolta = entrada.next();
    
    
    Aviao a1 = new Aviao();
    
    a1.setPassageiro(Passageiro);
    a1.setPassaporte(Passaporte);
    a1.setRG(RG);
    a1.setOrigem(Origem);
    a1.setDestino(Destino);
    a1.setDataSaida(DataSaida);
    a1.setDataVolta(DataVolta);
    
    System.out.println("\nO nome do passageiro é: " + a1.getPassageiro());
    System.out.println("O número do passaporte é: " + a1.getPassaporte());
    System.out.println("O número do RG do passageiro é: " + a1.getRG());
    System.out.println("O local de origem do passageiro é:" + a1.getOrigem());
    System.out.println("O local de destino desejado do passageiro é: " + a1.getDestino());
    System.out.println("A data de saida escolhida foi: " + a1.getDataSaida());
    System.out.println("A data de volta escolhida foi: " + a1.getDataVolta());
    
    entrada.close();
    
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
