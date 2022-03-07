package br.com.generation.poo;

public class Paciente {

	String nome,diagnostico;
	int idade;
	
	
	void diagnosticar(String nome,int idade,String diagnostico){
		System.out.println(nome +", de "+ idade +" anos, você esta com "+ diagnostico + "!!");
		
	}
}
