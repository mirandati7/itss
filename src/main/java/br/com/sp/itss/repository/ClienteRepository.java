package br.com.sp.itss.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.sp.itss.domain.Cliente;

@Repository
public interface ClienteRepository extends GenericJpaRepository<Cliente, Long>{
	
	@Query(" select cliente.nome from Cliente cliente " +
			   " where " +   
			   "   ( cliente.cpf =:cpf ) ")
	Cliente findByCPF(@Param("cpf") String cpf);
	
	
	@Query(" select bean "			
			+ " from Cliente bean "			
			+ " where (bean.nome like %:nome% or :nome is null) " )
	Page<Cliente> list(@Param("nome") String nome,Pageable pageable);	
	

}
