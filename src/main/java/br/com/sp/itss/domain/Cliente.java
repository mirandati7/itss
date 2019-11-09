package br.com.sp.itss.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente extends IDBaseEntity {

	@Column(name = "nome", length = 100,nullable =  false)
	private String nome;

	@Column(name = "cpf", length = 14, nullable = false)
	private String cpf;
	
	@Column(name = "telefone", nullable = true, length = 25)
	private String telefone;

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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
