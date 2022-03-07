package br.com.generation.poo;

public class TestaEletronico {
	

	public static void main(String[] args) {
	Eletronico e1 = new Eletronico();
	
	e1.setNome("Celular");
	e1.setFonteEnergia("Bateria");
	e1.setCor(": Preto");
	
	System.out.println("Informações sobre o aparelho eletronico!");
	
	System.out.println("Tipo de eletronico: "+e1.getNome());
	System.out.println("Fonte de energia: "+e1.getFonteEnergia());
	System.out.println("Cor"+e1.getCor());
	System.out.println();
	
	
	   e1.liga();
	   System.out.println();
	   e1.desliga();
	
	}

}
