package br.com.sp.itss.dto;

import java.math.BigDecimal;

public class PatioDTO extends EntidadeDTO {

	private String descricao;

	private Long numeroVagas;

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