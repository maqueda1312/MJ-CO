package es.codeurjc.web.model;

//@Entity
public class Pedido {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String nombre;
    String apellidos;
    String direccion;
    String tipo_componente;
    int telefono;
    int anio;
    double precio;

    public Pedido() {

    }

    public Pedido(String nombre, String apellidos, String direccion, String tipo_componente, int telefono, int anio, double precio) {
        super();
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.tipo_componente=tipo_componente;
        this.telefono=telefono;
        this.anio=anio;
        this.precio = precio;
    }

    public double getPrecio_pedido() {
        return precio;
    }

    public void setPrecio_pedido(double precio_pedido) {
        this.precio = precio_pedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getTipo_componente() {
        return tipo_componente;
    }

    public void setTipo_componente(String tipo_componente) {
        this.tipo_componente = tipo_componente;
    }

    @Override
    public String toString() {
        return "Pedido [id=" + id + ", Nombre=" + nombre + ", Apellidos=" + apellidos + ", Direccion=" + direccion
                + ", Telefono=" + telefono + ", AñoNacimiento=" + anio + "]";
    }



}
