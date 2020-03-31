package in.acesko.springbootcrud.springbootcrudapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Aktivnosti")
public class Aktivnosti {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer AktivnostiID;
	
	@Column
	private String URL;
	
	@Column
	private String Metoda;
	
	@Column
	private String URLRegex;

	public Integer getAktivnostiID() {
		return AktivnostiID;
	}

	public void setAktivnostiID(Integer aktivnostiID) {
		AktivnostiID = aktivnostiID;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getMetoda() {
		return Metoda;
	}

	public void setMetoda(String metoda) {
		Metoda = metoda;
	}

	public String getURLRegex() {
		return URLRegex;
	}

	public void setURLRegex(String uRLRegex) {
		URLRegex = uRLRegex;
	}

	@Override
	public String toString() {
		return "Aktivnosti [AktivnostiID=" + AktivnostiID + ", URL=" + URL + ", Metoda=" + Metoda + ", URLRegex="
				+ URLRegex + "]";
	}
	
}
