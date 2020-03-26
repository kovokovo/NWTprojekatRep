package in.acesko.springbootcrud.springbootcrudapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Naplata")
public class Naplata {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer NaplataID;
	
	@Column
	private Integer KorisnikID;
	
	@Column
	private Integer StavkaProdajeID;
	
	@Column
	private String Valuta;
	
	@Column
	private String Opis;
	
	@Column
	private String AdresaDostave;

	public Integer getNaplataID() {
		return NaplataID;
	}

	public void setNaplataID(Integer naplataID) {
		NaplataID = naplataID;
	}

	public Integer getKorisnikID() {
		return KorisnikID;
	}

	public void setKorisnikID(Integer korisnikID) {
		KorisnikID = korisnikID;
	}

	public Integer getStavkaProdajeID() {
		return StavkaProdajeID;
	}

	public void setStavkaProdajeID(Integer stavkaProdajeID) {
		StavkaProdajeID = stavkaProdajeID;
	}

	public String getValuta() {
		return Valuta;
	}

	public void setValuta(String valuta) {
		Valuta = valuta;
	}

	public String getOpis() {
		return Opis;
	}

	public void setOpis(String opis) {
		Opis = opis;
	}

	public String getAdresaDostave() {
		return AdresaDostave;
	}

	public void setAdresaDostave(String adresaDostave) {
		AdresaDostave = adresaDostave;
	}

	@Override
	public String toString() {
		return "Naplata [NaplataID=" + NaplataID + ", KorisnikID=" + KorisnikID + ", StavkaProdajeID=" + StavkaProdajeID
				+ ", Valuta=" + Valuta + ", Opis=" + Opis + ", AdresaDostave=" + AdresaDostave + "]";
	}
}
