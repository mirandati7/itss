package br.com.sp.itss.repository;

import java.math.BigDecimal;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.sp.itss.domain.Estacionamento;

@Repository
public interface EstacionamentoRepository extends GenericJpaRepository<Estacionamento, Long>{
	
	
	@Query(" select bean "			
			+ " from Estacionamento bean "	)		
	Page<Estacionamento> list(Pageable pageable);	
	
	@Query(" select count(bean.id) "+
			 " from Estacionamento bean"+ 
			 " inner join bean.patio patio "+
			 " where  patio.id = :idPatio ")
	 Long countVagasAlocadas(@Param("idPatio") Long idPatio);	
	
	@Query(" select sum(bean.valor) "+
			 " from Estacionamento bean"+ 
			 " inner join bean.patio patio "+
			 " where  patio.id = :idPatio ")
	BigDecimal sumValorRecebido(@Param("idPatio") Long idPatio);	

	

}
