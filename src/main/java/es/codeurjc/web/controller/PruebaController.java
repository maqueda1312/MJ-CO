package es.codeurjc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import es.codeurjc.web.model.Producto;

@Controller
public class PruebaController{

	@GetMapping("/")
	public String greeting(Model model) {

		Producto prueba = new Producto();

		model.addAttribute("product", prueba);

		return "greeting_template";
	}

}
