package br.com.sp.itss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sp.itss.core.pagination.PageResult;
import br.com.sp.itss.core.pagination.SearchParams;
import br.com.sp.itss.domain.Veiculo;
import br.com.sp.itss.dto.VeiculoDTO;
import br.com.sp.itss.service.VeiculoService;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController extends GenericController<VeiculoDTO, Veiculo, VeiculoService> {
	

	@Autowired
	protected VeiculoController(VeiculoService service) {
		super(service);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ResponseBody
	public PageResult<VeiculoDTO> list(@RequestBody SearchParams search) {
		PageRequest pageRequest = controllerManager.toPageRequest(search);

		Page<Veiculo> page = service.list(search.get("modelo"), 
											  pageRequest);
		return controllerManager.toPageResult(page, getDtoClass());

	}
	
	

}