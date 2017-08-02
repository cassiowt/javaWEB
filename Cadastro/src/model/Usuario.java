package model;

import java.sql.Date;

public class Usuario {
	private String nome;
	private String rg;
	private String cpf;
	private String email;
	private String salario;
	private Date dataNascimento;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", email=" + email + ", salario=" + salario
				+ ", dataNascimento=" + dataNascimento + "]";
	}
	

}
