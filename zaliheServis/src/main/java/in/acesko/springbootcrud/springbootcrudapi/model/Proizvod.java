package in.acesko.springbootcrud.springbootcrudapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Proizvod")
public class Proizvod {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer ProizvodID; 
	
	@Column
	private String Naziv;
	
	@Column
	private Double Cijena;
	
	@Column
	private Integer RaspolozivaKolicina;

	public Integer getProizvodID() {
		return ProizvodID;
	}

	public void setProizvodID(Integer proizvodID) {
		ProizvodID = proizvodID;
	}

	public String getNaziv() {
		return Naziv;
	}

	public void setNaziv(String naziv) {
		Naziv = naziv;
	}

	public Double getCijena() {
		return Cijena;
	}

	public void setCijena(Double cijena) {
		Cijena = cijena;
	}

	public Integer getRaspolozivaKolicina() {
		return RaspolozivaKolicina;
	}

	public void setRaspolozivaKolicina(Integer raspolozivaKolicina) {
		RaspolozivaKolicina = raspolozivaKolicina;
	}

	@Override
	public String toString() {
		return "Proizvod [ProizvodID=" + ProizvodID + ", Naziv=" + Naziv + ", Cijena=" + Cijena
				+ ", RaspolozivaKolicina=" + RaspolozivaKolicina + "]";
	}
	
}
