package ee.harjutamine.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TobeKontroller {

	@RequestMapping("/naitaVormi")
	public String kuvaVormi() {
		return "tobe";
	}
}
