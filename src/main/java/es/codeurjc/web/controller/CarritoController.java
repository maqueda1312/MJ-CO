package es.codeurjc.web.controller;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.codeurjc.web.model.CarritodeCompra;
import es.codeurjc.web.model.Producto;
import es.codeurjc.web.model.Usuario;
import es.codeurjc.web.repository.CarritoRepository;
import es.codeurjc.web.repository.ProductoRepository;
import es.codeurjc.web.repository.UsuarioRepository;
import es.codeurjc.web.service.CarritoService;
import es.codeurjc.web.service.ProductoService;

@Controller
public class CarritoController {
    @Autowired
	private ProductoRepository productoRepository;
   
    @Autowired
	private ProductoService productoService;
    @Autowired
	private CarritoService carritoService;

	@Autowired
	private CarritoRepository carritoRepository;	
	
    @Autowired
	private UsuarioRepository usuarioRepository;	

    CarritodeCompra carritoCompra;
	Usuario usuario;
	Optional<Producto> productoaux;

    @GetMapping("/carrito/{id}")
	public String verCarrito(Model model, @PathVariable long id) {
        model.addAttribute("carrito", carritoService.findAll());
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

	@GetMapping("/productoCarrito/{id}")
	public String agregarCarrito(Model model, @PathVariable long id) throws IOException {

		Producto producto = productoService.findById(id).get();
		model.addAttribute("producto", producto);

		//Desde aqui, se fuerza el carrito que queremos en este caso carritoGeneral

		Usuario admin = usuarioRepository.findByName("USU1");

		CarritodeCompra carrito = admin.getCarrito();

		carrito.getListaProductos().add(producto);

		carritoService.save(carrito);

		return "productoAgregadoCarrito";
	}


}
