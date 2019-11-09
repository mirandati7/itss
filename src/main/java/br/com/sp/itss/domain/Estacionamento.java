package br.com.sp.itss.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "estacionamento")
public class Estacionamento extends IDBaseEntity {
	
	@ManyToOne(fetch = FetchType.LAZY, optional=true)
	@JoinColumn(name = "patio_id")
	private Patio patio;
	
	@ManyToOne(fetch = FetchType.LAZY, optional=true)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@ManyToOne(fetch = FetchType.LAZY, optional=true)
	@JoinColumn(name = "veiculo_id")
	private Veiculo veiculo;

	@Column(name = "tempo_permanencia")
	private Long tempoPermanencia;

	@Column(name="valor", precision = 11, scale = 2)
	private BigDecimal valor;

	@Column(name = "data_hora_chegada")
	private LocalDateTime dataHoraChegada;

	@Column(name = "data_hora_saida")
	private LocalDateTime dataHoraSaida;

	public Patio getPatio() {
		return patio;
	}

	public void setPatio(Patio patio) {
		this.patio = patio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
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
