package in.acesko.springbootcrud.springbootcrudapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Dopustenja")
public class Dopustenja {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer DopustenjaID;
	
	@Column
	private String Naziv;
	
	@Column
	private Date KreiranaU;
	
	@Column
	private Date AzuriranaU;

	public Integer getDopustenjaID() {
		return DopustenjaID;
	}

	public void setDopustenjaID(Integer dopustenjaID) {
		DopustenjaID = dopustenjaID;
	}

	public String getNaziv() {
		return Naziv;
	}

	public void setNaziv(String naziv) {
		Naziv = naziv;
	}

	public Date getKreiranaU() {
		return KreiranaU;
	}

	public void setKreiranaU(Date kreiranaU) {
		KreiranaU = kreiranaU;
	}

	public Date getAzuriranaU() {
		return AzuriranaU;
	}

	public void setAzuriranaU(Date azuriranaU) {
		AzuriranaU = azuriranaU;
	}

	@Override
	public String toString() {
		return "Dopustenja [DopustenjaID=" + DopustenjaID + ", Naziv=" + Naziv + ", KreiranaU=" + KreiranaU
				+ ", AzuriranaU=" + AzuriranaU + "]";
	}
	
}
