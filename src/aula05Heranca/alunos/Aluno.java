package aula05Heranca.alunos;

import aula05Heranca.Pessoa;

public class Aluno extends Pessoa{
	private String nome;
	private int semestre;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
}
