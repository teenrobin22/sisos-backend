package aate.gob.pe.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import aate.gob.pe.model.Tipo;

public interface ITipoRepo extends JpaRepository<Tipo,Integer> {

	@Query(value = "select t from Tipo t join t.padre p  where p.TIPCOD = :tippadcod and t.ESTREG=1")
	List<Tipo> listarPadre(@Param("tippadcod") Integer tipcod);
}
