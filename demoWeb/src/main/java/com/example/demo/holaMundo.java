package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holaMundo {
	
	@RequestMapping("/saludo")
	public String Saludar() {
		return "Hola Mundo";
	}

}
