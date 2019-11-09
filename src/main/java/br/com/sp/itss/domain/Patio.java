package br.com.sp.itss.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "patio")
public class Patio extends IDBaseEntity {

	@Column(name = "descricao", length = 100,nullable =  false)
	private String descricao;

	@Column(name = "numero_vagas")
	private Long numeroVagas;
	
	@Column(name="taxa_hora", precision = 11, scale = 2)
	private BigDecimal taxaHora;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getNumeroVagas() {
		return numeroVagas;
	}

	public void setNumeroVagas(Long numeroVagas) {
		this.numeroVagas = numeroVagas;
	}

	public BigDecimal getTaxaHora() {
		return taxaHora;
	}

	public void setTaxaHora(BigDecimal taxaHora) {
		this.taxaHora = taxaHora;
	}

	
	
}
