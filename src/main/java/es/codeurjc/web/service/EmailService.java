 package es.codeurjc.web.service;

 import org.springframework.scheduling.annotation.EnableAsync;
 import org.springframework.stereotype.Service;

 import org.springframework.beans.factory.annotation.Value;
 import org.springframework.http.HttpEntity;
 import org.springframework.http.HttpHeaders;
 import org.springframework.http.MediaType;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.scheduling.annotation.Async;
 import org.springframework.scheduling.annotation.EnableAsync;
 import org.springframework.stereotype.Service;
 import org.springframework.web.client.RestTemplate;

import es.codeurjc.web.model.Pedido;
import es.codeurjc.web.model.Producto;

import java.net.URI;
 import java.net.URISyntaxException;
import java.util.List;

import static es.codeurjc.web.constant.InternalServicesStaticValues.URL_FOLLOW_BY_USER_MAIL;

 @Service
 @EnableAsync
 public class EmailService {
     @Value("${service.email}")
     private String service;


     public record EmailRequest(String to, String subject, String body) {
     }
        //Aqui irian los objetos que queremos que salgan en los email? Nombre, direccion, pedido y precio?

     public String resumenPedido(Pedido pedido){
        
        String pedidoPersonal = "";
        List <Producto> listaProductos = pedido.getListaProductos();
        for(int i=0; i<listaProductos.size(); i++){
            
            Producto producto = listaProductos.get(i);
            pedidoPersonal += producto.getNombre() + " " + producto.getDescripcion() + " " + producto.getPrecio() + "\n";
        } 
        return pedidoPersonal += "Precio total: " + pedido.suma + "\n";
     }

     public void sendConfirmacionPedido(Pedido pedido)
             throws URISyntaxException {
         var url = new URI(service + URL_FOLLOW_BY_USER_MAIL);
         var request = new EmailRequest(
                 pedido.getMail(),
                 "Pedido realizado en MJ&CO",
                 """
                        El pedido realizado es
                        %s

                        La direccion de envio es la siguiente: %s , nuestro plan es que te llegue en los proximos 3 dias. 
                                                
                         %s %s gracias por comprar en nuestra tienda y confiar en nosotros!                        
                         """.formatted(resumenPedido(pedido),pedido.getDireccion(), pedido.getNombre(), pedido.getApellido())
                                          
                         

         );
         sendMail(request, url);
     }

     @Async
     void sendMail(EmailRequest request, URI url) {
         var restTemplate = new RestTemplate();
         var head = new HttpHeaders();
         head.setContentType(MediaType.APPLICATION_JSON);

         var reqEntity = new HttpEntity<>(request, head);

         restTemplate.postForEntity(url, reqEntity, EmailRequest.class);
     }


 } 

