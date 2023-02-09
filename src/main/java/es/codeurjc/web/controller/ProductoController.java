//CONTROLADOR DE LOS PRODUCTOS


package es.codeurjc.web.controller;
@Controller
public class ProductoController {
	
	@Autowired
	private ProductoServicio productoServicio;
	
	@Autowired
	private TiendaServicio tiendaServicio;
	
	@GetMapping("/")
	public String mostarProductos(Model model) {

		model.addAttribute("productos", productoServicio.findAll());

		return "productos";
	}
	
	@GetMapping("/removeproducto/{id}")
	public String removeproducto(Model model, @PathVariable long id) {

		Optional<Producto> producto = productoServicio.findById(id);
		if (producto.isPresent()) {
			productoServicio.delete(id);
			model.addAttribute("producto", producto.get());
		}
		return "removeproducto";
	}
	@GetMapping("/newproducto")
	public String newProducto(Model model) {

		model.addAttribute("tiendasDisponibles", productoServicio.findAll());

		return "newProductosPagina";
	}
	
	@GetMapping("/editbook/{id}")
	public String editProducto(Model model, @PathVariable long id) {

		Optional<Producto> producto = productoServicio.findById(id);
		if (book.isPresent()) {
			model.addAttribute("producto", producto.get());
			return "editProductoPagina";
		} else {
			return "producto";
		}
	}
	
}
