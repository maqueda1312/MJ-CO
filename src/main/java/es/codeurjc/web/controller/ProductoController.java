package es.codeurjc.web.controller;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import es.codeurjc.web.model.CarritodeCompra;
import es.codeurjc.web.model.Producto;
import es.codeurjc.web.model.Usuario;
import es.codeurjc.web.repository.UsuarioRepository;
import es.codeurjc.web.service.CarritoService;
import es.codeurjc.web.service.ProductoService;

@Controller
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CarritoService carritoService;


    @GetMapping("/nuevoProducto")
	public String newBook(Model model) {

	    return "nuevoProducto";
	}


    @PostMapping("/nuevoProducto")
	public String nuevoProdcutoProceso(Model model, Producto producto) throws IOException {

		productoService.save(producto);

		model.addAttribute("productoId", producto.getId());

		return "redirect:/producto/" + producto.getId();
	}


	@GetMapping("/borrarProducto/{id}")
	public String borrarProducto(Model model, @PathVariable long id) {

		Optional<Producto> producto = productoService.findById(id);
		if (producto.isPresent()) {
			productoService.delete(id);
			model.addAttribute("producto", producto.get());
		}
		return "borrarProducto";
	}





}
