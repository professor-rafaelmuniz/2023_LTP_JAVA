package util;

import java.util.ArrayList;

public class Aluno {
	private int codigo;
	private String nome;
	private String prontuario;
	private ArrayList<Disciplina> listaDisciplina;
	
	
	public void inserirDisciplina(Disciplina disc) {
		listaDisciplina.add(disc);
	}
	
	
	public ArrayList<Disciplina> getListaDisciplina() {
		return listaDisciplina;
	}

	public void setListaDisciplina(ArrayList<Disciplina> listaDisciplina) {
		this.listaDisciplina = listaDisciplina;
	}

	public Aluno(int codigo, String nome, String prontuario) {
		this.codigo = codigo;
		this.nome = nome;
		this.prontuario = prontuario;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProntuario() {
		return prontuario;
	}
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
	
	
	@Override
	public String toString() {
		return "Aluno [codigo=" + codigo + ", nome=" + nome + ", prontuario=" + prontuario + "]";
	}
	
	
	
}
