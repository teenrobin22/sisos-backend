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

@Table(name="SISOS_TM_TIPO")
@Entity(name = "Tipo")
public class Tipo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SISOS_SQ_TIPO")
    @SequenceGenerator(sequenceName = "SISOS_SQ_TIPO", allocationSize = 1, name = "SISOS_SQ_TIPO")
	@Column(name = "TIPCOD")
	private Integer TIPCOD;
	
	@Column(name = "TIPNOM", nullable = true,length = 50)
	private String TIPNOM;
	
	@ManyToOne
	@JoinColumn(name = "TIPPADCOD", referencedColumnName = "TIPCOD", foreignKey =  @ForeignKey(name = "FK_SISOS_TM_TIPO_TM_TIPO") )
	private Tipo padre;
	
	@Column(name = "TIPOBS1", nullable = true,length = 50)
	private String TIPOBS1;
	
	@Column(name = "TIPOBS2", nullable = true,length = 50)
	private String TIPOBS2;
	
	@Column(name = "TIPOBS3", nullable = true,length = 50)
	private String TIPOBS3;
	
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
	public Integer getTIPCOD() {
		return TIPCOD;
	}
	public void setTIPCOD(Integer tIPCOD) {
		TIPCOD = tIPCOD;
	}
	public String getTIPNOM() {
		return TIPNOM;
	}
	public void setTIPNOM(String tIPNOM) {
		TIPNOM = tIPNOM;
	}
	public Tipo getPadre() {
		return padre;
	}
	public void setPadre(Tipo padre) {
		this.padre = padre;
	}
	public String getTIPOBS1() {
		return TIPOBS1;
	}
	public void setTIPOBS1(String tIPOBS1) {
		TIPOBS1 = tIPOBS1;
	}
	public String getTIPOBS2() {
		return TIPOBS2;
	}
	public void setTIPOBS2(String tIPOBS2) {
		TIPOBS2 = tIPOBS2;
	}
	public String getTIPOBS3() {
		return TIPOBS3;
	}
	public void setTIPOBS3(String tIPOBS3) {
		TIPOBS3 = tIPOBS3;
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
