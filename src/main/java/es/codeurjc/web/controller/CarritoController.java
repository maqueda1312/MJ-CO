package es.codeurjc.web.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.codeurjc.web.model.CarritodeCompra;
import es.codeurjc.web.model.Producto;
import es.codeurjc.web.model.Usuario;
import es.codeurjc.web.repository.CarritoRepository;
import es.codeurjc.web.repository.ProductoRepository;
import es.codeurjc.web.repository.UsuarioRepository;
import es.codeurjc.web.service.ProductoService;

@Controller
public class CarritoController {
    @Autowired
	private ProductoRepository productoRepository;
   
    @Autowired
	private ProductoService productoService;

	@Autowired
	private CarritoRepository carritoRepository;	
	
    @Autowired
	private UsuarioRepository usuarioRepository;	

    CarritodeCompra carritoCompra;
	Usuario usuario;
	Optional<Producto> productoaux;

    @GetMapping("/carrito")
	public String verCarrito(Model model) {
		model.addAttribute("producto", carritoRepository.findAll());
		return "carrito";
	}

    @GetMapping("/agregarProductosCarrito")
	public String agregarProductosCarrito(Model model) {
		return "agregarProductosCarrito";
	}

    @PostMapping("/anadirProducto")
	public String anadirProducto(Model model, @RequestParam long Id) {
	
		productoaux = productoRepository.findById(Id);
		
		Optional<Producto> producto = productoService.findById(Id);
		
		return"/";
		
	}




}
