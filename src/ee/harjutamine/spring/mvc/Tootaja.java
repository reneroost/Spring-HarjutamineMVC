package ee.harjutamine.spring.mvc;

import java.util.LinkedHashMap;

public class Tootaja {
	
	private String eesNimi;
	private String pereNimi;
	private String riik;
	private String lemmikKeel;
	private String opSusteemid;
	
	private LinkedHashMap<String, String> riigiValikud;
	
	public Tootaja() {
		riigiValikud = new LinkedHashMap<>();
		riigiValikud.put("EST", "Eesti");
		riigiValikud.put("MLT", "Malta");
		riigiValikud.put("KGZ", "Kõrgõzstan");
		riigiValikud.put("GHA", "Ghana");
		riigiValikud.put("SLV", "El Salvador");
		
	}

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
	
	public String getRiik() {
		return riik;
	}
	
	public void setRiik(String riik) {
		this.riik = riik;
	}
	
	public LinkedHashMap<String, String> getRiigiValikud() {
		return riigiValikud;
	}
	
	public String getLemmikKeel() {
		return lemmikKeel;
	}
	
	public void setLemmikKeel(String keel) {
		this.lemmikKeel = keel;
	}

	public String getOpSusteemid() {
		return opSusteemid;
	}

	public void setOpSusteemid(String opSusteem) {
		this.opSusteemid = opSusteem;
	}
}
