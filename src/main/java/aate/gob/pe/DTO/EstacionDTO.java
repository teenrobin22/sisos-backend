package aate.gob.pe.DTO;

public class EstacionDTO {
private String ESTNOM;
private Integer ESTCOD;
private Integer DISCOD;
private Integer TIPCOD;


public EstacionDTO( Integer eSTCOD,String eSTNOM, Integer dISCOD, Integer tIPCOD) {
	super();
	ESTCOD = eSTCOD;
	ESTNOM = eSTNOM;
	DISCOD = dISCOD;
	TIPCOD = tIPCOD;
}

public String getESTNOM() {
	return ESTNOM;
}
public void setESTNOM(String eSTNOM) {
	ESTNOM = eSTNOM;
}
public Integer getESTCOD() {
	return ESTCOD;
}
public void setESTCOD(Integer eSTCOD) {
	ESTCOD = eSTCOD;
}
public Integer getDISCOD() {
	return DISCOD;
}
public void setDISCOD(Integer dISCOD) {
	DISCOD = dISCOD;
}
public Integer getTIPCOD() {
	return TIPCOD;
}
public void setTIPCOD(Integer tIPCOD) {
	TIPCOD = tIPCOD;
}


}
