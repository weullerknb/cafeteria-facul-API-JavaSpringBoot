package br.com.cafeteria.projeto.model;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@NotBlank(message = "Nome é obrigatório!")
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;
	
	@CPF(message = "Insira um CPF válido!")
	@NotBlank(message = "CPF é obrigatório!")
	@Column(name = "cpf", length = 15, nullable = false)
	private String cpf;
	
	@NotBlank(message = "Data de nascimento é obrigatório!")
	@Column(name = "nascimento", nullable = false)
	private String nascimento;
	
	@NotBlank(message = "Telefone é obrigatório!")
	@Column(name = "telefone", length = 15, nullable = false)
	private String telefone;
	
	@Email(message = "Insira um email válido!")
	@NotBlank(message = "Email é obrigatório!")
	@Column(name = "email", length = 50, nullable = false)
	private String email;
	
	@NotBlank(message = "Senha é obrigatório!")
	@Column(name = "senha", columnDefinition = "TEXT", nullable = false)
	private String senha;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
