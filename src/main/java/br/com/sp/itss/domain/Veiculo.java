package br.com.sp.itss.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "veiculo")
public class Veiculo extends IDBaseEntity {
	
	@Column(name = "placa", length = 7,nullable =  false)
	private String placa;
	
	@Column(name = "modelo", length = 100,nullable =  false)
	private String modelo;
	
	@Column(name = "cor", length = 20,nullable =  false)
	private String cor;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	
	
}
