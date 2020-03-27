package in.acesko.springbootcrud.springbootcrudapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Role")
public class Role {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer RolaID;
	
	@Column
	private String NazivRole;
	
	@Column
	private Date KreiranaU;
	
	@Column
	private Date AzuriranaU;

	public Integer getRolaID() {
		return RolaID;
	}

	public void setRolaID(Integer rolaID) {
		RolaID = rolaID;
	}

	public String getNazivRole() {
		return NazivRole;
	}

	public void setNazivRole(String nazivRole) {
		NazivRole = nazivRole;
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
		return "Role [RolaID=" + RolaID + ", NazivRole=" + NazivRole + ", KreiranaU=" + KreiranaU + ", AzuriranaU="
				+ AzuriranaU + "]";
	}
	
	
}
