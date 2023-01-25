# Nombre: MJ-CO

- **Descripción**:
  - Tienda de componentes de ordenador y ordenadores hechos.

- **Funcionalidad pública**

  - Navegación libre a través de la web pudiendo ver los ordenadores ya montados o componentes.
  - Preguntas frecuentes.
  - Atención al cliente.
  - Loguearte.

- **Funcionalidad privada**

  - Ver carrito de compra.
  - Historial de compra.
  - Realizar seguimiento del pedido.

- **Entidades**:

  - Carrito de compra: Listado de productos guardados.
  
  - Pedido:  Entidad la cual es un resumen que incluye los productos comprados, junto con el precio final, la direccion de entrega y la fecha aproximada de entrega.
  
  - Producto: Entidad que representa al objeto que se compra, almacena toda su información.
  
  - Usuario: Utiliza la web y en la que tienes registrados los datos de compra (dirección, nombre o su historial de compra).
  
- **Servicio interno**:

  - Dispondra de un servicio que mande e-mails despues de realizar una compra con la confirmacion del pedido y la factura del mismo.
