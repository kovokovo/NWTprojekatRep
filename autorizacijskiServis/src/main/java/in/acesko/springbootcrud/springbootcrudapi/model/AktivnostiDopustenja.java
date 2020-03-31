package in.acesko.springbootcrud.springbootcrudapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_AktivnostiDopustenja")
public class AktivnostiDopustenja {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer AktivnostiDopustenjaID;
	
	@Column
	private Integer DopustenjaID;
	
	@Column
	private Integer AktivnostiID;

	public Integer getAktivnostiDopustenjaID() {
		return AktivnostiDopustenjaID;
	}

	public void setAktivnostiDopustenjaID(Integer aktivnostiDopustenjaID) {
		AktivnostiDopustenjaID = aktivnostiDopustenjaID;
	}

	public Integer getDopustenjaID() {
		return DopustenjaID;
	}

	public void setDopustenjaID(Integer dopustenjaID) {
		DopustenjaID = dopustenjaID;
	}

	public Integer getAktivnostiID() {
		return AktivnostiID;
	}

	public void setAktivnostiID(Integer aktivnostiID) {
		AktivnostiID = aktivnostiID;
	}

	@Override
	public String toString() {
		return "AktivnostiDopustenja [AktivnostiDopustenjaID=" + AktivnostiDopustenjaID + ", DopustenjaID="
				+ DopustenjaID + ", AktivnostiID=" + AktivnostiID + "]";
	}
	
}
