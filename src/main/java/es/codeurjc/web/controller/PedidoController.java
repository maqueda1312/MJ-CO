package es.codeurjc.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.codeurjc.web.model.Pedido;
import es.codeurjc.web.model.Usuario;

@RequestMapping("/pedidos")
@Controller
public class PedidoController {
	//@Autowired
	//private PedidoRepository pedidos;
	
	//@Autowired
	//private UserRepository userRepository;
		
	//@PostMapping("/pedidoaux")
	/*public String nuevoPedido(Model model, Pedido pedido, HttpServletRequest request) {
		//Usuario Usuario=userRepository.findByName(request.getUserPrincipal().getNombre());
		//pedido.save(pedido);
		model.addAttribute("mail", Usuario.getMail());
		model.addAttribute("pedido", pedido);
		//ServicioInterno si = new ServicioInterno();
		String nombre = pedido.getNombre();
		String apellido = pedido.getApellidos();
		String tipo = pedido.getTipo_componente();
		Double precio = pedido.getPrecio_pedido();
		
		//si.enviar(nombre, apellido, tipo, precio, user.getMail());
		
		return "comprado";	
	}*/
	
}
