package aula05Heranca.alunos;

import aula05Heranca.funcionarios.Professor;

public class TestandoClasses {

	public static void main(String[] args) {
		//PROFESSOR
		Professor prof1 = new Professor();
		prof1.setNome("Joana");
		prof1.setIdade(34);
		prof1.setEndereco("Rua: Antonio dos Santos 234");
		prof1.setSalario(2500);
		
		System.out.printf("=== Dados do Professor ===");
		System.out.printf("\nNome: %s",prof1.getNome());
		System.out.printf("\nIdade: %d",prof1.getIdade());
		System.out.printf("\nEndereço: %s",prof1.getEndereco());
		System.out.printf("\nSalário: %.2f",prof1.getSalario());
		System.out.println();
		
		//ALUNO
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Mariana");
		aluno1.setSemestre(5);
		aluno1.setIdade(18);
		aluno1.setEndereco("Rua: Das Flores 12");
		
		System.out.printf("\n=== Dados do Aluno ===");
		System.out.printf("\nNome: %s",aluno1.getNome());
		System.out.printf("\nIdade: %d",aluno1.getIdade());
		System.out.printf("\nEndereço: %s",aluno1.getEndereco());

	}

}
