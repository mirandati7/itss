package br.com.sp.itss.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sp.itss.dto.DashboardDTO;
import br.com.sp.itss.service.DashboardService;


@RestController
@RequestMapping("/api/dashboard")
public class DashboardController  {

	@Autowired
	private DashboardService dashboardService;
	
	
	@RequestMapping(value = "/total/{idPatio}", method = RequestMethod.GET)
	@ResponseBody
	public DashboardDTO totalVendasRealizadas(@PathVariable("idPatio") Long idPatio){
		return dashboardService.total(idPatio);
	}
	
	
}
