package in.acesko.springbootcrud.springbootcrudapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_KorisnickaDopustenja")
public class KorisnickaDopustenja {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer KorisnickaDopustenjaID;
	
	@Column
	private Integer UlogaID;
	
	@Column
	private Integer DopustenjaID;

	public Integer getKorisnickaDopustenjaID() {
		return KorisnickaDopustenjaID;
	}

	public void setKorisnickaDopustenjaID(Integer korisnickaDopustenjaID) {
		KorisnickaDopustenjaID = korisnickaDopustenjaID;
	}

	public Integer getUlogaID() {
		return UlogaID;
	}

	public void setUlogaID(Integer ulogaID) {
		UlogaID = ulogaID;
	}

	public Integer getDopustenjaID() {
		return DopustenjaID;
	}

	public void setDopustenjaID(Integer dopustenjaID) {
		DopustenjaID = dopustenjaID;
	}

	@Override
	public String toString() {
		return "KorisnickaDopustenja [KorisnickaDopustenjaID=" + KorisnickaDopustenjaID + ", UlogaID=" + UlogaID
				+ ", DopustenjaID=" + DopustenjaID + "]";
	}
	
}
