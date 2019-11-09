package br.com.sp.itss.service;

import java.math.BigDecimal;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.sp.itss.domain.Estacionamento;
import br.com.sp.itss.domain.Patio;
import br.com.sp.itss.repository.EstacionamentoRepository;
import br.com.sp.itss.util.Calculo;

@Service
public class EstacionamentoService extends GenericService<Estacionamento, EstacionamentoRepository> {
	
	@Autowired
	private PatioService patioService;
	
	@Autowired
	public EstacionamentoService(EstacionamentoRepository repository) {
		super(repository);
	}
	
	public Page<Estacionamento> list(String historico, Pageable pageable) {
		return repository.list(pageable);
	}
	
	public Long countVagasAlocadas( Long idPatio) {
		return repository.countVagasAlocadas(idPatio);
	}
	
	public BigDecimal sumValorRecebido( Long idPatio) {
		return repository.sumValorRecebido(idPatio);
	}


	
	@Override
	public Estacionamento save(Estacionamento entity) {
		
		entity = calcularValor(entity);
		return repository.save(entity);
	}
	
	
	private Estacionamento calcularValor(Estacionamento entity) {
		
		Patio patio = patioService.findOne(entity.getPatio().getId());
		
		long baseHora = 60; // 60 Minutos
		long qtdeHorasUtilizadas = 0;
		
		long minutes = ChronoUnit.MINUTES.between(entity.getDataHoraChegada(), entity.getDataHoraSaida());
			
		qtdeHorasUtilizadas = minutes / baseHora;
		
		BigDecimal valorCobrado = Calculo.multiplicar(new BigDecimal(qtdeHorasUtilizadas),patio.getTaxaHora());
		entity.setValor(valorCobrado);
		entity.setTempoPermanencia(qtdeHorasUtilizadas);
		
		return entity;
	}
	
	
}