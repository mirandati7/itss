package br.com.sp.itss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.sp.itss.domain.Patio;
import br.com.sp.itss.repository.PatioRepository;

@Service
public class PatioService extends GenericService<Patio, PatioRepository> {
	
	@Autowired
	public PatioService(PatioRepository repository) {
		super(repository);
	}
	
	public Page<Patio> list(String descricao, Pageable pageable) {
		return repository.list(descricao, pageable);
	}
	
	
}