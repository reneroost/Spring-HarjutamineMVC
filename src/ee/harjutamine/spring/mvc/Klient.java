package ee.harjutamine.spring.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Klient {

	private String eesNimi;
	
	@NotNull(message="on kohustuslik")
	@Size(min=3, message="peab olema vähemalt 3 tähemärki")
	private String pereNimi;
	
	
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
	
	
}
