package in.acesko.springbootcrud.springbootcrudapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_KorisnickeRole")
public class KorisnickeRole {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer KorisnickaRolaID;
	
	@Column
	private Integer KorisnikID;
	
	@Column
	private Integer RolaID;

	public Integer getKorisnickaRolaID() {
		return KorisnickaRolaID;
	}

	public void setKorisnickaRolaID(Integer korisnickaRolaID) {
		KorisnickaRolaID = korisnickaRolaID;
	}

	public Integer getKorisnikID() {
		return KorisnikID;
	}

	@Override
	public String toString() {
		return "KorisnickeRole [KorisnickaRolaID=" + KorisnickaRolaID + ", KorisnikID=" + KorisnikID + ", RolaID="
				+ RolaID + "]";
	}

	public void setKorisnikID(Integer korisnikID) {
		KorisnikID = korisnikID;
	}

	public Integer getRolaID() {
		return RolaID;
	}

	public void setRolaID(Integer rolaID) {
		RolaID = rolaID;
	}
}
