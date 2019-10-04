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

@Table(name="SISOS_TM_EVENTO")
@Entity(name = "Evento")
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SISOS_SQ_EVENTO")
    @SequenceGenerator(sequenceName = "SISOS_SQ_EVENTO", allocationSize = 1, name = "SISOS_SQ_EVENTO")
	@Column(name = "EVENCOD")
	private Integer EVENCOD;
		
	@ManyToOne
	@JoinColumn(name = "ESTCOD", nullable = false, foreignKey = @ForeignKey(name = "FK_SISOS_EVENTO_ESTACION"))
	private Estacion estacion;
	
	@ManyToOne
	@JoinColumn(name = "EVENCODTIP", referencedColumnName = "TIPCOD",nullable = false, foreignKey =  @ForeignKey(name = "FK_SISOS_EVENTO_TIPO") )
	private Tipo tipo;
	
	@ManyToOne
	@JoinColumn(name = "EVENCODUBI", referencedColumnName = "TIPCOD",nullable = false, foreignKey =  @ForeignKey(name = "FK_SISOS_EVENTO_UBICACION") )
	private Tipo ubicacion;
	
	@ManyToOne
	@JoinColumn(name = "EVENCODEQU", referencedColumnName = "TIPCOD",nullable = false, foreignKey =  @ForeignKey(name = "FK_SISOS_EVENTO_EQUIPO") )
	private Tipo equipo;
	
	@ManyToOne
	@JoinColumn(name = "EVENCODPRI", referencedColumnName = "TIPCOD",nullable = false, foreignKey =  @ForeignKey(name = "FK_SISOS_EVENTO_PRIORIDAD") )
	private Tipo prioridad;
	
	@Column(name = "EVENOBS", length = 4000)
	private String EVENOBS;
		
	@Column(name = "EVENEST", nullable = true, length = 3)
	private Integer EVENEST;
	
	@Column(name = "EVENOBSADMIN", length = 4000)
	private String EVENOBSADMIN;
	
	@Column(name = "USUREG", nullable = true,length = 30)
	private String USUREG;
	
	@Column(name = "FECREG", nullable = true)
	private LocalDate FECREG = LocalDate.now();
	
	@Column(name = "USUMOD", nullable = true, length = 30)
	private String USUMOD;
	
	@Column(name = "FECMOD", nullable = true)
	private LocalDate FECMOD;
	
	@Column(name = "ESTREG", nullable = true, length = 3)
	private Integer ESTREG =1;

	public Integer getEVENCOD() {
		return EVENCOD;
	}

	public void setEVENCOD(Integer eVENCOD) {
		EVENCOD = eVENCOD;
	}

	public Estacion getEstacion() {
		return estacion;
	}

	public void setEstacion(Estacion estacion) {
		this.estacion = estacion;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Tipo getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Tipo ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Tipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Tipo equipo) {
		this.equipo = equipo;
	}

	public Tipo getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Tipo prioridad) {
		this.prioridad = prioridad;
	}

	public String getEVENOBS() {
		return EVENOBS;
	}

	public void setEVENOBS(String eVENOBS) {
		EVENOBS = eVENOBS;
	}

	public Integer getEVENEST() {
		return EVENEST;
	}

	public void setEVENEST(Integer eVENEST) {
		EVENEST = eVENEST;
	}

	public String getEVENOBSADMIN() {
		return EVENOBSADMIN;
	}

	public void setEVENOBSADMIN(String eVENOBSADMIN) {
		EVENOBSADMIN = eVENOBSADMIN;
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
