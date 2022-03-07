package br.com.generation.poo;

public class TestaFuncionario {

	public static void main(String[] args) {

	Funcionario f = new Funcionario();
	
	f.setNome("Victor Oliveira");
	f.setCargo("Desenvolvedor Java");
	f.setSalario(1600);
		
	System.out.println("As informações do funcionario é ");
	System.out.println("---------------------------------");
	System.out.println("Nome: "+f.getNome());
	System.out.println("Cargo: "+f.getCargo());
	System.out.println("Salario: "+f.getSalario());
	
	
	}

}
