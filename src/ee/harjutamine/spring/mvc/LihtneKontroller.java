package ee.harjutamine.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tere")
public class LihtneKontroller {

	@RequestMapping("/naitaVormiLihtne")
	public String kuvaVormi() {
		return "nimesisestus-vorm";
	}
}
