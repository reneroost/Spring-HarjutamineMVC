package ee.harjutamine.spring.mvc;

import org.springframework.stereotype.Controller;
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
}
