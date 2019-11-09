package br.com.sp.itss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.sp.itss.domain.Veiculo;
import br.com.sp.itss.repository.VeiculoRepository;

@Service
public class VeiculoService extends GenericService<Veiculo, VeiculoRepository> {
	
	@Autowired
	public VeiculoService(VeiculoRepository repository) {
		super(repository);
	}
	
	public Page<Veiculo> list(String descricao, Pageable pageable) {
		return repository.list(descricao, pageable);
	}
	
	
}