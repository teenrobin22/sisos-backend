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

@Table(name="SISOS_TD_EVENTO_HISTORIAL")
@Entity(name="EventoHistorial")
public class EventoHistorial {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SISOS_SQ_EVENTO")
    @SequenceGenerator(sequenceName = "SISOS_SQ_EVENTO", allocationSize = 1, name = "SISOS_SQ_EVENTO")
	@Column(name = "EHISCOD")
	private Integer EHISCOD;
		
	@ManyToOne
	@JoinColumn(name = "EVENCOD", nullable = false, foreignKey = @ForeignKey(name = "FK_SISOS_EHISTORIAL_EVENTO"))
	private Evento evento;
	
	@ManyToOne
	@JoinColumn(name = "ESTCOD", nullable = false, foreignKey = @ForeignKey(name = "FK_SISOS_EHISTORIAL_ESTACION"))
	private Estacion estacion;
	
	@ManyToOne
	@JoinColumn(name = "EVENCODTIP", referencedColumnName = "TIPCOD",nullable = false, foreignKey =  @ForeignKey(name = "FK_SISOS_EHISTORIAL_TIPO") )
	private Tipo tipo;
	
	@ManyToOne
	@JoinColumn(name = "EVENCODUBI", referencedColumnName = "TIPCOD",nullable = false, foreignKey =  @ForeignKey(name = "FK_SISOS_EHISTORIAL_UBICACION") )
	private Tipo ubicacion;
	
	@ManyToOne
	@JoinColumn(name = "EVENCODEQU", referencedColumnName = "TIPCOD",nullable = false, foreignKey =  @ForeignKey(name = "FK_SISOS_EHISTORIAL_EQUIPO") )
	private Tipo equipo;
	
	@ManyToOne
	@JoinColumn(name = "EVENCODPRI", referencedColumnName = "TIPCOD",nullable = false, foreignKey =  @ForeignKey(name = "FK_SISOS_EHISTORIAL_PRIORIDAD") )
	private Tipo prioridad;
	
	@Column(name = "EVENOBS", length = 4000)
	private String EVEOBS;
		
	@Column(name = "EVENOBSADMIN", length = 4000)
	private String EVENOBSADMIN;
	
	@Column(name = "EVENEST", nullable = true, length = 3)
	private Integer EVEEST;
	
	@Column(name = "USUREG", nullable = true,length = 30)
	private String USUREG;
	
	@Column(name = "FECREG", nullable = true)
	private LocalDate FECREG = LocalDate.now();
	
	@Column(name = "USUMOD", nullable = true, length = 30)
	private String USUMOD;
	
	@Column(name = "FECMOD", nullable = true)
	private LocalDate FECMOD;
	
	@Column(name = "ESTREG", nullable = true, length = 3)
	private Integer ESTREG;
	
	
}
