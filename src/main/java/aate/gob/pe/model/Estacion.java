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


@Table(name="SISOS_TM_ESTACION")
@Entity(name = "Estacion")
public class Estacion {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SISOS_SQ_ESTACION")
    @SequenceGenerator(sequenceName = "SISOS_SQ_ESTACION", allocationSize = 1, name = "SISOS_SQ_ESTACION")
	@Column(name = "ESTCOD")
	private Integer ESTCOD;
	
	@ManyToOne
	@JoinColumn(name = "DISCOD", nullable = false, foreignKey = @ForeignKey(name = "FK_SISOS_ESTACION_DISTRITO"))
	private Distrito distrito;
	
	@Column(name = "ESTNOM", length = 100)
	private String ESTNOM;
	
	@Column(name = "ESTABREV", length = 20)
	private String ESTABREV;
		
	@Column(name = "ESTDIRECCION", length = 1000)
	private String ESTDIRECCION;

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

	public Integer getESTCOD() {
		return ESTCOD;
	}

	public void setESTCOD(Integer eSTCOD) {
		ESTCOD = eSTCOD;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public String getESTNOM() {
		return ESTNOM;
	}

	public void setESTNOM(String eSTNOM) {
		ESTNOM = eSTNOM;
	}

	public String getESTDIRECCION() {
		return ESTDIRECCION;
	}

	public void setESTDIRECCION(String eSTDIRECCION) {
		ESTDIRECCION = eSTDIRECCION;
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
