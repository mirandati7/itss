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
import br.com.sp.itss.domain.Cliente;
import br.com.sp.itss.dto.ClienteDTO;
import br.com.sp.itss.service.ClienteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Clientes" ,description = "Endpoint" , tags = "Clientes")
@RestController
@RequestMapping("/api/clientes")
public class ClienteController extends GenericController<ClienteDTO, Cliente, ClienteService> {
	

	@Autowired
	protected ClienteController(ClienteService service) {
		super(service);
	}

	@ApiOperation(value = "Lista todos registros de cliente com paginação")
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ResponseBody
	public PageResult<ClienteDTO> list(@RequestBody SearchParams search) {
		PageRequest pageRequest = controllerManager.toPageRequest(search);

		Page<Cliente> page = service.list(search.get("nome"), 
											  pageRequest);
		return controllerManager.toPageResult(page, getDtoClass());

	}
	
	

}