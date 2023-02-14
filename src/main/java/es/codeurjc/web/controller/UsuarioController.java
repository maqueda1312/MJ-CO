package es.codeurjc.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import es.codeurjc.web.model.Usuario;

@Controller
public class UsuarioController {
	
	//@Autowired
	//private PackRepository packs;
	
	//private ComentarioRepository coment;
	//@Autowired
	//private UserRepository users;
	
	//private PasswordEncoder encoder;
	
	
	
	@PostMapping("/nuevousuario")
	public String agregarUsuario(Model model, Usuario usuario) {
		System.out.println(usuario.getNombre());
		System.out.println(usuario.getContrasena());
		//usuario.save(new Usuario(usuario.getNombre(), usuario.getContrasena(), usuario.getMail(),  "ROLE_USER"));
		model.addAttribute("usuario", usuario);
		return "comprobacion";	
	}
	
	@GetMapping("/agregarusu")
	public String agregarUsu(Model model) {
		return "agregarusu";
	}
}


