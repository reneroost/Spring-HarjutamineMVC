package ee.harjutamine.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KoduKontroller {
	
	@RequestMapping("/")
	public String naitaLehte() {
		return "pea-men��";
	}

}
