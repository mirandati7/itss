package br.com.sp.itss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sp.itss.dto.DashboardDTO;
import br.com.sp.itss.service.DashboardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Dashboard" ,description = "Endpoint" , tags = "Dashboard")
@RestController
@RequestMapping("/api/dashboard")
public class DashboardController  {

	@Autowired
	private DashboardService dashboardService;
	
	
	
	@ApiOperation(value = "Lista totais de vagas e valor recebido do pátio.")
	@RequestMapping(value = "/total/{idPatio}", method = RequestMethod.GET)
	@ResponseBody
	public DashboardDTO total(@PathVariable("idPatio") Long idPatio){
		return dashboardService.total(idPatio);
	}
	
	
}
