package br.com.sp.itss.web;

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
import br.com.sp.itss.domain.Estacionamento;
import br.com.sp.itss.dto.EstacionamentoDTO;
import br.com.sp.itss.service.EstacionamentoService;

@RestController
@RequestMapping("/api/estacionamentos")
public class EstacionamentoController extends GenericController<EstacionamentoDTO, Estacionamento, EstacionamentoService> {
	
	@Autowired
	protected EstacionamentoController(EstacionamentoService service) {
		super(service);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ResponseBody
	public PageResult<EstacionamentoDTO> list(@RequestBody SearchParams search) {
		PageRequest pageRequest = controllerManager.toPageRequest(search);

		Page<Estacionamento> page = service.list(search.get("modelo"), 
											  pageRequest);
		return controllerManager.toPageResult(page, getDtoClass());

	}
	

	
	

}