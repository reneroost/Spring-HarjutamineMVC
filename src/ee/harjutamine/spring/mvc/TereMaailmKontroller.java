package ee.harjutamine.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TereMaailmKontroller {

	@RequestMapping("/naitaVormi")
	public String naitaVormi() {
		return "teremaailm-vorm";
	}
	
	@RequestMapping("/tootleVormi")
	public String tootleVormi() {
		return "teremaailm";
	}
	
	@RequestMapping("/tootleVormiVersioonKaks")
	public String suurteksTahtedeks(HttpServletRequest kutsung, Model mudel) {
		
		String nimi = kutsung.getParameter("opilaseNimi");
		
		nimi = nimi.toUpperCase();
		
		String vastus = "Peaksid olema suured tähed: " + nimi;
		
		mudel.addAttribute("sonum", vastus);
		
		return "teremaailm";
	}
}
