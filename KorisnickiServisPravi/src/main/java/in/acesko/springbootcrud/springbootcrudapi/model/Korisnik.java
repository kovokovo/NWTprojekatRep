package in.acesko.springbootcrud.springbootcrudapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Korisnik")
public class Korisnik {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer KorisnikID;
	
	@Column
	private String Ime;
	
	@Column
	private String Prezime;
	
	@Column
	private Integer Godine;
	
	@Column
	private String BrojKartice;

	public Integer getKorisnikID() {
		return KorisnikID;
	}

	public void setKorisnikID(Integer korisnikID) {
		KorisnikID = korisnikID;
	}

	public String getIme() {
		return Ime;
	}

	public void setIme(String ime) {
		Ime = ime;
	}

	public String getPrezime() {
		return Prezime;
	}

	public void setPrezime(String prezime) {
		Prezime = prezime;
	}

	public Integer getGodine() {
		return Godine;
	}

	public void setGodine(Integer godine) {
		Godine = godine;
	}

	public String getBrojKartice() {
		return BrojKartice;
	}

	public void setBrojKartice(String brojKartice) {
		BrojKartice = brojKartice;
	}

	@Override
	public String toString() {
		return "Korisnik [KorisnikID=" + KorisnikID + ", Ime=" + Ime + ", Prezime=" + Prezime + ", Godine=" + Godine
				+ ", BrojKartice=" + BrojKartice + "]";
	}
	
}
