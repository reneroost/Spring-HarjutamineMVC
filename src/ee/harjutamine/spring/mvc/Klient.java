package ee.harjutamine.spring.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import ee.harjutamine.spring.mvc.valideerimine.EsinduseKood;

public class Klient {

	private String eesNimi;
	
	@NotNull(message="On kohustuslik")
	@Size(min=3, message="peab olema vähemalt 3 tähemärki")
	private String pereNimi;
	
	@Min(value=18, message="vanus peab olema vahemikus 18-70")
	@Max(value=70, message="vanus peab olema vahemikus 18-70")
	private Integer vanus;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="Täpselt 5 tähte või numbrit")
	private String postiIndeks;
	
	@EsinduseKood
	private String esinduseKood;
	
	public String getEesNimi() {
		return eesNimi;
	}
	public void setEesNimi(String eesNimi) {
		this.eesNimi = eesNimi;
	}
	public String getPereNimi() {
		return pereNimi;
	}
	public void setPereNimi(String pereNimi) {
		this.pereNimi = pereNimi;
	}
	public Integer getVanus() {
		return vanus;
	}
	public void setVanus(Integer vanus) {
		this.vanus = vanus;
	}
	public String getPostiIndeks() {
		return postiIndeks;
	}
	public void setPostiIndeks(String postiIndeks) {
		this.postiIndeks = postiIndeks;
	}
	public String getEsinduseKood() {
		return esinduseKood;
	}
	public void setEsinduseKood(String esinduseKood) {
		this.esinduseKood = esinduseKood;
	}
	
	
}
