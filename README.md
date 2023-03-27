# Nombre: MJ-CO

- **Descripción**:
  - Tienda de componentes de ordenador y ordenadores hechos.

- **Funcionalidad pública**

  - Navegación libre a través de la web pudiendo ver los ordenadores ya montados o componentes.
  - Log-In.
  - Preguntas frecuentes.
  - Atención al cliente.
  
- **Funcionalidad privada**

  - Ver carrito de compra.
  - Agregar items al carrito de compra.
  - Pagar compra.
  - Historial de compra.
  - Realizar seguimiento del pedido.

- **Entidades**:

  - Carrito de compra: listado de productos guardados.
  
  - Pedido:  entidad la cual es un resumen que incluye los productos comprados, junto con el precio final, la dirección de entrega y la fecha aproximada de entrega.
  
  - Producto: entidad que representa al objeto que se compra, almacena toda su información.
  
  - Usuario: utiliza la web y en la que tienes registrados los datos de compra (dirección, nombre o su historial de compra).
  
- **Servicio interno**:
  - https://github.com/olme97/ServicioInterno

  - Dispondrá de un servicio que mande e-mails después de realizar una compra con la confirmación del pedido y la factura del mismo.  

- **Diagramas**:
  - Diagrama de navegacion  
   
  ![image](https://user-images.githubusercontent.com/118890068/221432112-80ad0810-10d6-4306-8d93-78dc43f76e54.png)  
  - UML  
  
  ![MJCOuml](https://user-images.githubusercontent.com/118890068/221434201-2383fefe-3f69-4f8b-957e-86d43b1da413.png)
  - E/R  
  
  ![image](https://user-images.githubusercontent.com/118890068/221560091-a7f3077e-e7c2-4dea-a546-a1a68e61b42c.png)  
    
- **Capturas de pantalla**:  
  
  - Página Principal:  
  Es la primera pagina al iniciar la web, desde aqui se visualizan todos los productos, pudiendo entrar en ellos para ver sus detalles. Tambien se pueden ver los botones para acceber a la pagina del carrito, a la pagina de añadir un nuevo producto a la base de datos y el de preguntas frequentes.  
    
  ![image](https://user-images.githubusercontent.com/118890068/221561796-460ce483-5c4a-452f-b1aa-ecbd7056edaa.png)  
  
    - Página Producto:  
  Es una página simple donde se pueden ver los detalles de cada producto, nombre precio y descripcion. Desde esta pagina tambien se puede agregar el producto al carrito o eliminarlo de la base de datos.
    
  ![image](https://user-images.githubusercontent.com/118890068/221562930-6729152d-8772-414a-a141-17088a2621f1.png)  
  
    - Página Agregar Producto:  
  Pagina en la que podemos añadir producto a la base de datos, en ella veremos un formulario para introducir el nombre el precio y una breve descripcion.  
    
  ![image](https://user-images.githubusercontent.com/118890068/221563412-1c638c5e-9d27-437d-9a97-858ff5bf1809.png)  
  
  - Página Carrito:  
  Pagina en la que podemos ver los productos que hemos añadido al carrito, podemos realizar el pedido o vaciar el carrito.  
    
  ![image](https://user-images.githubusercontent.com/118890068/221564246-3ead42ef-f233-44b1-b0ce-6fb23021cf9a.png)  
    
  - Página Pedido:  
  Pagina en la que vemos el resumen de productos que hemos comprado asi como la cuantia total del pedido.  
    
  ![image](https://user-images.githubusercontent.com/118890068/221564508-fa1ed9d0-eac2-4df7-8b2b-224eadf4258c.png)


