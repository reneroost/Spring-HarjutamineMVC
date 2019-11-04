package ee.harjutamine.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/klient")
public class KliendiKontroller {
	
	@InitBinder
	public void initBinder(WebDataBinder andmeteSiduja) {
		
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		andmeteSiduja.registerCustomEditor(String.class, trimmer);
	}

	@RequestMapping("/naitaVormiKlient")
	public String naitaVormi(Model mudel) {
		mudel.addAttribute("klient", new Klient());
		return "klient-vorm";
	}
	
	@RequestMapping("/tootleVormiKlient")
	public String tootleVormi(
			@Valid @ModelAttribute("klient") Klient klient,
			BindingResult tulemuseSidumine) {
		
		System.out.println("Perekonnanimi: |" + klient.getPereNimi() + "|");
		if(tulemuseSidumine.hasErrors()) {
			return "klient-vorm";
		} else {
			return "klient-kinnitus";
		}	
	}
}
