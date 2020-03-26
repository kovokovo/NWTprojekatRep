package in.acesko.springbootcrud.springbootcrudapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Feedback")
public class Feedback {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer FeedbackID;
	
	@Column
	private Integer KorisnikID;
	
	@Column
	private Integer NaplataID;
	
	@Column
	private Integer Ocjena;
	
	@Column
	private String Komentar;

	public Integer getFeedbackID() {
		return FeedbackID;
	}

	public void setFeedbackID(Integer feedbackID) {
		FeedbackID = feedbackID;
	}

	public Integer getKorisnikID() {
		return KorisnikID;
	}

	public void setKorisnikID(Integer korisnikID) {
		KorisnikID = korisnikID;
	}

	public Integer getNaplataID() {
		return NaplataID;
	}

	public void setNaplataID(Integer naplataID) {
		NaplataID = naplataID;
	}

	public Integer getOcjena() {
		return Ocjena;
	}

	public void setOcjena(Integer ocjena) {
		Ocjena = ocjena;
	}

	public String getKomentar() {
		return Komentar;
	}

	public void setKomentar(String komentar) {
		Komentar = komentar;
	}

	@Override
	public String toString() {
		return "Feedback [FeedbackID=" + FeedbackID + ", KorisnikID=" + KorisnikID + ", NaplataID=" + NaplataID
				+ ", Ocjena=" + Ocjena + ", Komentar=" + Komentar + "]";
	}
}
