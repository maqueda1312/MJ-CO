package es.codeurjc.web.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.codeurjc.web.model.CarritodeCompra;
import es.codeurjc.web.model.Usuario;
import es.codeurjc.web.repository.UsuarioRepository;
import es.codeurjc.web.service.UsuarioService;

@Controller
public class LoginController {

@Autowired
private UsuarioService usuarioService;

@Autowired
private PasswordEncoder passwordEncoder;


    @RequestMapping("/login")
    public String login() {
        return "index";
    }

    @RequestMapping("/loginerror")
    public String loginerror() {
        return "loginerror";
    }

    @GetMapping("/nuevoUsuario")
	public String newBook(Model model) {

	    return "nuevoUsuario";
	}
  
    @PostMapping("/nuevoUsuario")
	public String nuevoUsuario(Model model, Usuario usuario) throws IOException {

        List<String> roles;
        roles = new ArrayList<>();
        roles.add("USER");
        usuario.setEncodedPassword(passwordEncoder.encode(usuario.getEncodedPassword()));
        usuario.setRoles(roles);
        usuario.setCarrito(new CarritodeCompra());

		usuarioService.save(usuario);
		
		model.addAttribute("usuario", usuario.getId());
		

		return "redirect:/";
	}
   


}