package com.Mentalidades.Mentalidades.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/mentalidades")

public class MentalidadesController {

	@GetMapping
	
	public String Mentalidades (){
		return "Persistência, Orientação a Detalhes";
	}
	
}
