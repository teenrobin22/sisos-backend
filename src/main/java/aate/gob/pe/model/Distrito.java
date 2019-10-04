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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Table(name="SISOS_TM_DISTRITO")
@Entity(name = "Distrito")
public class Distrito {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SISOS_SQ_DISTRITO")
    @SequenceGenerator(sequenceName = "SISOS_SQ_DISTRITO", allocationSize = 1, name = "SISOS_SQ_DISTRITO")
	@Column(name = "DISCOD")
	private Integer DISCOD;
	
	/*@OneToMany
	@JoinColumn(name = "ZONCOD", referencedColumnName = "TIPCOD",nullable = false, foreignKey =  @ForeignKey(name = "FK_SISOS_DISTRITO_ZONA") )
	private Tipo zona;*/
	
	@Column(name = "DISNOM", length = 50)
	private String DISNOM;
	
	@Column(name = "USUREG", nullable = true,length = 30)
	private String USUREG;
	
	@Column(name = "FECREG", nullable = true)
	private LocalDate FECREG = LocalDate.now();
	
	@Column(name = "USUMOD", nullable = true, length = 30)
	private String USUMOD;
	
	@Column(name = "FECMOD", nullable = true)
	private LocalDate FECMOD;
	
	@Column(name = "ESTREG", nullable = true, length = 3)
	private Integer ESTREG = 1;

	public Integer getDISCOD() {
		return DISCOD;
	}

	public void setDISCOD(Integer dISCOD) {
		DISCOD = dISCOD;
	}

	public String getDISNOM() {
		return DISNOM;
	}

	public void setDISNOM(String dISNOM) {
		DISNOM = dISNOM;
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
