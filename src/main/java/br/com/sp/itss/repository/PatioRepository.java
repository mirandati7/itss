package br.com.sp.itss.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.sp.itss.domain.Patio;

@Repository
public interface PatioRepository extends GenericJpaRepository<Patio, Long>{
	
	
	@Query(" select bean "			
			+ " from Patio bean "			
			+ " where (bean.descricao like %:descricao% or :descricao is null) " )
	Page<Patio> list(@Param("descricao") String descricao,Pageable pageable);	
	

}
