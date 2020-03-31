package in.acesko.springbootcrud.springbootcrudapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_StavkaProdaje")
public class StavkaProdaje {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer StavkaProdajeID;
	
	@Column
	private Integer ProizvodID;
	
	@Column
	private Integer Kolicina;
	
	@Column
	private Double UkupnaCijena;

	public Integer getStavkaProdajeID() {
		return StavkaProdajeID;
	}

	public void setStavkaProdajeID(Integer stavkaProdajeID) {
		StavkaProdajeID = stavkaProdajeID;
	}

	public Integer getProizvodID() {
		return ProizvodID;
	}

	public void setProizvodID(Integer proizvodID) {
		ProizvodID = proizvodID;
	}

	public Integer getKolicina() {
		return Kolicina;
	}

	public void setKolicina(Integer kolicina) {
		Kolicina = kolicina;
	}

	public Double getUkupnaCijena() {
		return UkupnaCijena;
	}

	public void setUkupnaCijena(Double ukupnaCijena) {
		UkupnaCijena = ukupnaCijena;
	}

	@Override
	public String toString() {
		return "StavkaProdaje [StavkaProdajeID=" + StavkaProdajeID + ", ProizvodID=" + ProizvodID + ", Kolicina="
				+ Kolicina + ", UkupnaCijena=" + UkupnaCijena + "]";
	}
}
