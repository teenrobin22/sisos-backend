package aate.gob.pe.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import aate.gob.pe.model.Tipo;
import aate.gob.pe.model.ZonaDistrito;

public interface IZonaDistritoRepo extends JpaRepository<ZonaDistrito,Integer>  {

	@Query(value = "select z from  ZonaDistrito zd join zd.distrito d join zd.zona z where d.DISCOD= :discod")
	List<Tipo>listarZonaxDistrito(@Param("discod") Integer discod);
}
