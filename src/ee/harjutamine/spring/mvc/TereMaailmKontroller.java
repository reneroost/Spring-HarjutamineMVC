package ee.harjutamine.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/tere")
public class TereMaailmKontroller {

	@RequestMapping("/naitaVormi")
	public String naitaVormi() {
		return "nimesisestus-vorm";
	}
	
	@RequestMapping("/tootleVormi")
	public String tootleVormi() {
		return "teremaailm";
	}
	
	@RequestMapping("/tootleVormiVersioonKaks")
	public String suurteksTahtedeks(HttpServletRequest kutsung, Model mudel) {
		
		String nimi = kutsung.getParameter("tootajaNimi");
		
		nimi = nimi.toUpperCase();
		
		String vastus = "Peaksid olema suured tähed: " + nimi;
		
		mudel.addAttribute("sonum", vastus);
		
		return "teremaailm";
	}
	
	@RequestMapping("/tootleVormiVersioonKolm")
	public String tootleVormiVersioonKolm(
			@RequestParam("tootajaNimi") String nimi,
			Model mudel) {
		
		nimi = nimi.toUpperCase();
		
		String vastus = "Peaksid olema suured tähed (v3): " + nimi;
		
		mudel.addAttribute("sonum", vastus);
		
		return "teremaailm";
	}
}
