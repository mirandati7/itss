package br.com.sp.itss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.sp.itss.domain.Cliente;
import br.com.sp.itss.repository.ClienteRepository;

@Service
public class ClienteService extends GenericService<Cliente, ClienteRepository> {
	
	@Autowired
	public ClienteService(ClienteRepository repository) {
		super(repository);
	}
	
	public Cliente findByCPF(String cpf) {
		return repository.findByCPF(cpf);
	}
	
	public Page<Cliente> list(String nome, Pageable pageable) {
		return repository.list(nome, pageable);
	}
	
	
}