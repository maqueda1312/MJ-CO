package es.codeurjc.web.controller;

import org.hibernate.engine.jdbc.BlobProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import es.codeurjc.web.model.Producto;
import es.codeurjc.web.service.ProductoService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Controller
public class ProductoController {

    @Autowired
    private ProductoService productoService;

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

}
