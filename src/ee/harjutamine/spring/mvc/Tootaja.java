package ee.harjutamine.spring.mvc;

public class Tootaja {
	
	private String eesNimi;
	private String pereNimi;
	
	public Tootaja() {}

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
