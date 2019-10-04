package aate.gob.pe.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "SISOS_TV_ZONA_DISTRITO")
@Entity(name="ZonaDistrito")
public class ZonaDistrito {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SISOS_SQ_ZONA_DISTRITO")
    @SequenceGenerator(sequenceName = "ACSE_SQ_ZONA_DISTRITO", allocationSize = 1, name = "ACSE_SQ_ZONA_DISTRITO")
	@Column(name = "ZONDISCOD")
	private Integer ZONDISCOD;
	
	@ManyToOne
	@JoinColumn(name = "TIPCOD", nullable = false, foreignKey = @ForeignKey(name = "FK_ACSE_ZONA_DISTRITO_ZONA"))
	private Tipo zona;

	@ManyToOne
	@JoinColumn(name = "DISCOD", nullable = false, foreignKey = @ForeignKey(name = "FK_ACSE_ZONA_DISTRITO_DISTRITO"))
	private Distrito distrito;
	
	@Column(name = "USUREG", nullable = true, length = 30)
	private String USUREG;
	@Column(name = "FECREG", nullable = true)
	private LocalDate FECREG = LocalDate.now();
	@Column(name = "USUMOD", nullable = true, length = 30)
	private String USUMOD;
	@Column(name = "FECMOD", nullable = true)
	private LocalDate FECMOD;
	@Column(name = "ESTREG", nullable = true, length = 3)
	private Integer ESTREG;
	
	public Integer getZONDISCOD() {
		return ZONDISCOD;
	}
	public void setZONDISCOD(Integer zONDISCOD) {
		ZONDISCOD = zONDISCOD;
	}
	public Tipo getZona() {
		return zona;
	}
	public void setZona(Tipo zona) {
		this.zona = zona;
	}
	public Distrito getDistrito() {
		return distrito;
	}
	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}
	public String getUSUREG() {
		return USUREG;
	}
	public void setUSUREG(String uSUREG) {
		USUREG = uSUREG;
	}
	public LocalDate getFECREG() {
		return FECREG;
	}
	public void setFECREG(LocalDate fECREG) {
		FECREG = fECREG;
	}
	public String getUSUMOD() {
		return USUMOD;
	}
	public void setUSUMOD(String uSUMOD) {
		USUMOD = uSUMOD;
	}
	public LocalDate getFECMOD() {
		return FECMOD;
	}
	public void setFECMOD(LocalDate fECMOD) {
		FECMOD = fECMOD;
	}
	public Integer getESTREG() {
		return ESTREG;
	}
	public void setESTREG(Integer eSTREG) {
		ESTREG = eSTREG;
	}
	
	
}
