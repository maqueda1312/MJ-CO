package es.codeurjc.web.controller;

import es.codeurjc.web.model.CarritodeCompra;
import es.codeurjc.web.model.Producto;
import es.codeurjc.web.model.Usuario;
import es.codeurjc.web.repository.UsuarioRepository;

import org.hibernate.engine.jdbc.BlobProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import es.codeurjc.web.service.CarritoService;
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

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CarritoService carritoService;

   @PostConstruct
    public void init(){
        //System.out.println("#######PRUEBA_1#########");
        productoService.save(new Producto ("PRODUCTO 1", 35.00, "primera prueba"));
        productoService.save(new Producto ("RTX 4090 Founders Edition", 2000.00, "Tarjeta grafica NVIDIA"));
        productoService.save(new Producto ("Placa Base ", 150.00, "Placa Base Asus"));
        productoService.save(new Producto ("Teclado Mecanico", 350.00, "Teclado Mecanico gamming"));
        productoService.save(new Producto ("Pantalla LG 4K", 270.00, "Pantalla curva LG 27' 4K UHD"));
        
        //creacion de usuario de prueba
       Usuario admin = new Usuario("USU1", "CORREO1", "pass", "admin");
       admin.setCarrito(new CarritodeCompra()); 
       usuarioRepository.save(admin);
       usuarioRepository.save(new Usuario("USU2", "CORREO2", "pass", "user"));

      }

    @GetMapping("/")
    public String mostrarProductos(Model model) {
        //System.out.println("#######PRUEBA_2#########");

        model.addAttribute("productos", productoService.findAll());

       // System.out.println("#######PRUEBA_3#########");

        return "index";
    }

    @GetMapping("/producto/{id}")
    public String mostrarProducto(Model model, @PathVariable long id) {

      //  System.out.println("#######PRUEBA_4#########");
        
        Optional<Producto> producto = productoService.findById(id);
        if (producto.isPresent()) {
            model.addAttribute("producto", producto.get());
            return "producto";
        } else {
            return "index";
        }

    }

}
