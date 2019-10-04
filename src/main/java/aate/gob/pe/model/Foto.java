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


@Table(name="SISOS_TD_EVENTO_FOTO")
@Entity(name = "Foto")
public class Foto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SISOS_SQ_IMAGEN")
    @SequenceGenerator(sequenceName = "SISOS_SQ_FOTO", allocationSize = 1, name = "SISOS_SQ_FOTO")
	@Column(name = "FOTCOD")
	private Integer FOTCOD;
	
	@ManyToOne
	@JoinColumn(name = "EVECOD", nullable = false, foreignKey = @ForeignKey(name = "FK_SISOS_FOTO_EVENTO"))
	private Evento evento;
	
	@Column(name = "FOTNOM", length = 20)
	private String FOTNOM;
	
	@Column(name = "FOTRUT", nullable = true,length = 150)
	private String FOTRUT;
	
	@Column(name = "FOTO", updatable = false)
	private byte[] FOTO;
	
	@Column(name = "FOTEST", nullable = true, length = 3)
	private Integer FOTEST;
	
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

	public Integer getFOTCOD() {
		return FOTCOD;
	}

	public void setFOTCOD(Integer fOTCOD) {
		FOTCOD = fOTCOD;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public String getFOTNOM() {
		return FOTNOM;
	}

	public void setFOTNOM(String fOTNOM) {
		FOTNOM = fOTNOM;
	}

	public String getFOTRUT() {
		return FOTRUT;
	}

	public void setFOTRUT(String fOTRUT) {
		FOTRUT = fOTRUT;
	}

	public byte[] getFOTO() {
		return FOTO;
	}

	public void setFOTO(byte[] fOTO) {
		FOTO = fOTO;
	}

	public Integer getFOTEST() {
		return FOTEST;
	}

	public void setFOTEST(Integer fOTEST) {
		FOTEST = fOTEST;
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
