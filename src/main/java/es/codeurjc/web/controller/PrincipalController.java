package es.codeurjc.web.controller;

import es.codeurjc.web.model.Producto;
import org.hibernate.engine.jdbc.BlobProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import es.codeurjc.web.service.ProductoService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

@Controller
public class PrincipalController {

    @Autowired
    private ProductoService productoService;

   @PostConstruct
    public void init(){
        System.out.println("guardandooooo");
        productoService.save(new Producto ("PRODUCTO 1", 35.00, "primera prueba"));
    }

    @GetMapping("/")
    public String mostrarProductos(Model model) {
        System.out.println("PRUEBAAAAAAAAAAA");

        model.addAttribute("productos", productoService.findAll());
        
        return "index";
    }

    @GetMapping("/producto/{id}")
    public String mostrarProducto(Model model, @PathVariable long id) {
        
        Optional<Producto> producto = productoService.findById(id);
        if (producto.isPresent()) {
            model.addAttribute("producto", producto.get());
            return "producto";
        } else {
            return "index";
        }

    }

}
