package com.hernandez.Saludo.Controlador;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hernandez.Saludo.model.Detalle;

@RestController
@RequestMapping("/Saludo")

public class Controlador {
		
	//para poder mostrar lo del metodo en json
		@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
		public Detalle saludo() {
			Detalle det=new Detalle();
			det.setDestino("Para quien lo lea");
			det.setContenido("Hola que tal?");
			return det;
			
		}
	
		//para poder mostrar lo del metodo en XML
	/*
	@GetMapping(produces = {MediaType.APPLICATION_XML_VALUE})
	public Detalle saludo() {
		Detalle det=new Detalle();
		det.setDestino("Para quien lo lea");
		det.setContenido("Hola que tal?");
		return det;
	}
	*/
		
		//para poder mostrar lo del metodo en HTML
		/*
		@GetMapping(path = {"/prueba"})
		
		//llama el file html creado en temple
		public String saludohtml() {
			return "saludo";
		}
	
	*/


	
}
