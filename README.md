# Nombre: MJ-CO

- **Video**: https://youtu.be/rYJv4WFTDf0

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
   
  
  ![diagrama de nav (1)](https://user-images.githubusercontent.com/123573638/227988038-6b1c5caa-3302-4097-a040-840c71da02df.png)

  - UML  
  
  ![image](https://user-images.githubusercontent.com/118890068/236480231-0e6ba0a7-91ae-46ab-9480-2ada4854725a.png) 
  ![image](https://user-images.githubusercontent.com/118890068/228016912-7453fd06-2271-4be5-979b-59e6011aa93c.png)  
  
  - E/R  
  
  ![image](https://user-images.githubusercontent.com/118890068/221560091-a7f3077e-e7c2-4dea-a546-a1a68e61b42c.png)  
    
- **Capturas de pantalla**:  
  
  - Página Principal:  
  Es la primera pagina al iniciar la web, desde aqui se visualizan todos los productos, pudiendo entrar en ellos para ver sus detalles. Tambien se pueden ver los botones para acceber a la pagina del carrito, a la pagina de añadir un nuevo producto a la base de datos y el de preguntas frequentes.  
    
 ![image](https://user-images.githubusercontent.com/123573638/227988181-689c8550-0d2c-4913-91b1-f7622378401c.png)  
 
  - Página Producto: 
  Es una página simple donde se pueden ver los detalles de cada producto, nombre precio y descripcion. Desde esta pagina tambien se puede agregar el producto al carrito o eliminarlo de la base de datos.
    
  ![image](https://user-images.githubusercontent.com/123573638/227988547-7fe49c15-fc25-450f-ba58-92d053d8b8db.png)
  
  - Página Agregar Producto:  
  Pagina en la que podemos añadir producto a la base de datos, en ella veremos un formulario para introducir el nombre el precio y una breve descripcion.  
    
  ![image](https://user-images.githubusercontent.com/123573638/227988397-9ed31d6c-a1a7-4229-9301-f2060b7537e6.png)
  
  - Página Carrito:  
  Pagina en la que podemos ver los productos que hemos añadido al carrito, podemos realizar el pedido o vaciar el carrito.  
    
  ![image](https://user-images.githubusercontent.com/123573638/227988287-5b76d344-bffa-4138-927e-75744c52d9c7.png)
    
  - Página Pedido:  
  Pagina en la que vemos el resumen de productos que hemos comprado asi como la cuantia total del pedido.  
    
  ![image](https://user-images.githubusercontent.com/123573638/227988350-a554c750-e974-4698-a9f9-530324486983.png)
 
  - Página Ver Mis pedidos:  
  Pagina en la que podemos ver los pedidos realizados tras su compra. 

  ![image](https://user-images.githubusercontent.com/123573638/227989337-fadbda76-9820-422c-a477-6b92d9ca2c66.png)

  
  
 - Instrucciones precisas para desplegar la aplicación: compilación, cómo subir el jar, qué hace
falta instalar en la máquina.  

Para subir el jar necesitamos encontarnos en el mismo directorio donde tenemos los archivos, realizaremos el comando *scp -i rutadelaclavessh nombre.jar ubuntu@ip*.  

Despues entraremos en la maquina, con el comando *ssh -i rutadelaclavessh ubuntu@ip*.  

Se necesita instalar JAVA usando estos comandos  
*sudo apt-get update
sudo apt install -y openjdk-17-jre*  

Para el docker:  
*curl https://get.docker.com | sh  
sudo usermod -aG docker nombredelusuario  
sudo apt install docker-compose*  

Cuando tengamos todo instalado procedemos a ejecutar primero el servicio interno con el comando *java -jar nombre.jar --server.port=8443 --email.user=usario --email.password=password*; y seguido ejecutaremos la aplicacion con el comando *java -jar nombre.jar*.

Por ultimo para acceder a la aplicacion desde el navegador deberemos escribir la url *https://ip:puerto*
