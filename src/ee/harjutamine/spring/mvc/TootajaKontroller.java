package ee.harjutamine.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tootaja")
public class TootajaKontroller {

	@RequestMapping("/naitaVormiTootaja")
	public String naitaVormi(Model mudel) {
		
		Tootaja tootaja = new Tootaja();
		
		mudel.addAttribute("tootaja", tootaja);
		
		return "tootaja-vorm";
	}
	
	@RequestMapping("/tootleVormiTootaja")
	public String tootleVormi(@ModelAttribute("tootaja") Tootaja tootaja) {
		
		System.out.println("tootaja: " + tootaja.getEesNimi() +
				" " + tootaja.getPereNimi());
		return "tootaja-kinnitus";
	}
}
