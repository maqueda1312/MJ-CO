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

  - Dispondrá de un servicio que mande e-mails después de realizar una compra con la confirmación del pedido y la factura del mismo.  

- **Diagramas**:
  - Diagrama de navegacion  
   
  ![image](https://user-images.githubusercontent.com/118890068/221432112-80ad0810-10d6-4306-8d93-78dc43f76e54.png)  
  - UML  
  
  ![MJCOuml](https://user-images.githubusercontent.com/118890068/221434201-2383fefe-3f69-4f8b-957e-86d43b1da413.png)

