package es.codeurjc.web.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import es.codeurjc.web.model.CarritodeCompra;
import es.codeurjc.web.model.Pedido;
import es.codeurjc.web.model.Producto;
import es.codeurjc.web.model.Usuario;
import es.codeurjc.web.repository.CarritoRepository;
import es.codeurjc.web.repository.PedidoRepository;
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
	private PedidoRepository pedidoRepository;	
	

	@Autowired
	private CarritoRepository carritoRepository;	
	
    @Autowired
	private UsuarioRepository usuarioRepository;	

    CarritodeCompra carritoCompra;
	Optional<Producto> productoaux;


	




    @GetMapping("/carrito/")
	public String verCarrito(Model model, HttpServletRequest request) {
		Principal principal = request.getUserPrincipal();
		Optional <Usuario> optionalUser = usuarioRepository.findByName(principal.getName());
		if (optionalUser.isPresent()){
			Usuario user = optionalUser.get();
			CarritodeCompra carrito = user.getCarrito();
			model.addAttribute("carrito", carrito);		
			//De esta forma solo se ve el carrito del usuario sin poder ver el carrito de otro usuario. 
		}
        

		
		return "carrito";
	}


    @PostMapping("/anadirProducto")
	public String anadirProducto(Model model, @RequestParam long Id) {
	
		productoaux = productoRepository.findById(Id);
		
		Optional<Producto> producto = productoService.findById(Id);
		
		return"/";
		
	}

	@GetMapping("/productoCarrito/{id}")
	public String agregarCarrito(Model model, @PathVariable long id, HttpServletRequest request) throws IOException {

		Principal principal = request.getUserPrincipal();
		

		Producto producto = productoService.findById(id).get();
		model.addAttribute("producto", producto);

		//Desde aqui, se fuerza el carrito que queremos en este caso carritoGeneral

		Optional <Usuario> optionalAdmin = usuarioRepository.findByName(principal.getName());
		if (optionalAdmin.isPresent()){
			Usuario admin = optionalAdmin.get();
			CarritodeCompra carrito = admin.getCarrito();
			carrito.getListaProductos().add(producto);

			carritoService.save(carrito);
		}



		return "productoAgregadoCarrito";
	}

	@PostMapping("/pedido")
	public String obtenerPedido(Model model, HttpServletRequest request) throws IOException {
		// deberia realizar un nuevo pedido
		Pedido pedido = new Pedido();
		double suma=0;

	

		// por lo que hay que recuperar el carrito y mover productos de carrito a pedido (eliminando los productos del carrito)
		Principal principal = request.getUserPrincipal();
		Optional <Usuario> optionalUser = usuarioRepository.findByName(principal.getName());
		Usuario user = optionalUser.get();
		CarritodeCompra carrito = user.getCarrito();
		List <Producto> listaProductos = carrito.getListaProductos();
		//pedido.setListaProductos(listaProductos);
		for(Producto p:listaProductos){
			
			pedido.getListaProductos().add(p);
			
			pedido.suma+=p.getPrecio();
		}
		
		//elimnar sus elementos(vaciar el carrito) y volver a gaurdar el carrito 
		List <Producto> listaVacia = new ArrayList<>();
		carrito.setListaProductos(listaVacia);
		carritoService.save(carrito);
		//calcular precio total del pedido
		//pedido.setPrecio(1000); //calcularrr

		//pedido = pedidoRepository.save(pedido);
		//se guarda el pedido mostrando un detalle del pedido.
		Usuario usuario = carrito.getUsuario();
		usuario.addPedido(pedido);
		usuarioRepository.save(usuario);
		
		model.addAttribute("pedido",pedido );

		return "pedido";

	}

	//@PostMapping("/pedido")
	//public String pedido(Model model){
	//	return "pedido";
	//}



    //****************hasta aqui funciona
	@GetMapping("/vaciarCarrito")
	public String vaciarCarrito(Model model) throws IOException {

		CarritodeCompra carrito = carritoService.findAll().get(0);
		List <Producto> listaVacia = new ArrayList<>();
		carrito.setListaProductos(listaVacia);
		carritoService.save(carrito);


		return "vaciarCarrito";
	}

}
