package pl.rj.eKingdom.controllers;

import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@Controller
public class MainController {

	
	@GetMapping("/")
	public String welcomePage(Map <String, Object> model) {
		model.put("message", "Welcome in eKingdom!" );
		return "index";
	}
	
}