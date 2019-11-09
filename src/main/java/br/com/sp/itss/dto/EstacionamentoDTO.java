package br.com.sp.itss.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class EstacionamentoDTO extends EntidadeDTO {

	private Long clienteId;

	private String clienteNome;

	private Long veiculoId;

	private String veiculoModelo;

	private String veiculoPlaca;

	private Long patioId;

	private String patioDescricao;

	private Long tempoPermanencia;

	private BigDecimal valor;

	private LocalDateTime dataHoraChegada;

	private LocalDateTime dataHoraSaida;

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public String getClienteNome() {
		return clienteNome;
	}

	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}

	public Long getVeiculoId() {
		return veiculoId;
	}

	public void setVeiculoId(Long veiculoId) {
		this.veiculoId = veiculoId;
	}

	public String getVeiculoModelo() {
		return veiculoModelo;
	}

	public void setVeiculoModelo(String veiculoModelo) {
		this.veiculoModelo = veiculoModelo;
	}

	public String getVeiculoPlaca() {
		return veiculoPlaca;
	}

	public void setVeiculoPlaca(String veiculoPlaca) {
		this.veiculoPlaca = veiculoPlaca;
	}

	public Long getPatioId() {
		return patioId;
	}

	public void setPatioId(Long patioId) {
		this.patioId = patioId;
	}

	public String getPatioDescricao() {
		return patioDescricao;
	}

	public void setPatioDescricao(String patioDescricao) {
		this.patioDescricao = patioDescricao;
	}

	public Long getTempoPermanencia() {
		return tempoPermanencia;
	}

	public void setTempoPermanencia(Long tempoPermanencia) {
		this.tempoPermanencia = tempoPermanencia;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDateTime getDataHoraChegada() {
		return dataHoraChegada;
	}

	public void setDataHoraChegada(LocalDateTime dataHoraChegada) {
		this.dataHoraChegada = dataHoraChegada;
	}

	public LocalDateTime getDataHoraSaida() {
		return dataHoraSaida;
	}

	public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
		this.dataHoraSaida = dataHoraSaida;
	}

}