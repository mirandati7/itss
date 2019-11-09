package br.com.sp.itss.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.sp.itss.domain.Veiculo;

@Repository
public interface VeiculoRepository extends GenericJpaRepository<Veiculo, Long>{
	
	
	@Query(" select bean "			
			+ " from Veiculo bean "			
			+ " where (bean.modelo like %:modelo% or :modelo is null) " )
	Page<Veiculo> list(@Param("modelo") String modelo,Pageable pageable);	
	
}
