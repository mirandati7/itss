package br.com.sp.itss.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sp.itss.domain.Patio;
import br.com.sp.itss.dto.DashboardDTO;

@Service
public class DashboardService {

	@Autowired
	private PatioService patioService;
	
	@Autowired
	private EstacionamentoService estacionamentoService;
	
	public DashboardDTO total(Long idPatio) {	
		
		Long vagasAlocadas = estacionamentoService.countVagasAlocadas(idPatio);
		
		Patio patio = patioService.findOne(idPatio);
		
		Long vagasDisponives = patio.getNumeroVagas() - vagasAlocadas;
		
		BigDecimal valorRecebido = estacionamentoService.sumValorRecebido(idPatio);
		
		DashboardDTO dashboardDTO = new DashboardDTO(patio.getNumeroVagas(),
													 vagasAlocadas,
													 vagasDisponives,
													 valorRecebido);
		return dashboardDTO;
	}
}
