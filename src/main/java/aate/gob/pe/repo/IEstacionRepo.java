package aate.gob.pe.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import aate.gob.pe.DTO.EstacionDTO;
import aate.gob.pe.model.Estacion;

public interface IEstacionRepo extends JpaRepository<Estacion, Integer>{

	@Query(value = "select e from Estacion e where (e.ESTCOD = :estcod or :estcod =-1) and e.ESTREG=1")
	List<Estacion>listarEstacion(@Param("estcod") Integer estcod);
	
	@Query(value = "select new aate.gob.pe.DTO.EstacionDTO(e.ESTCOD,e.ESTNOM,d.DISCOD,zd.zona.TIPCOD) from Estacion e join e.distrito d inner join ZonaDistrito zd on zd.distrito.DISCOD = d.DISCOD where (e.ESTCOD = :estcod or :estcod =-1) and e.ESTREG=1 ")
	List<EstacionDTO>listarEstacionZonaDistrito(@Param("estcod") Integer estcod);
}
