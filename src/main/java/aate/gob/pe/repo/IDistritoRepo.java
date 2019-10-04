package aate.gob.pe.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import aate.gob.pe.model.Distrito;
import aate.gob.pe.model.Estacion;

public interface IDistritoRepo extends JpaRepository<Distrito, Integer>{
	@Query(value = "select d from Distrito d where (d.DISCOD = :discod or :discod =-1) and d.ESTREG=1")
	List<Distrito>listarDistrito(@Param("discod") Integer discod);
	
}
