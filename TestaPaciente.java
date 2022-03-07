package br.com.generation.poo;

public class TestaPaciente {

	public static void main(String[] args) {

		Paciente p1 = new Paciente();
		
		p1.nome = "Victor Oliveira";
		p1.idade = 22;
		p1.diagnostico = "COVID-19";

		
		p1.diagnosticar(p1.nome, p1.idade, p1.diagnostico);
		
		
	}

}
