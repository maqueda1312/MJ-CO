package es.codeurjc.web.model;

public class Producto{
    private String nombre;
    private float precio;
    private String descripcion;

    public Producto(){
        
    }
    public Producto(String nombre, float precio, String descripcion){
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }


    public String getNombre() {
        String nombre = "PC 1 DE LA PRACTICA";
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        int precio = 100;
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        String descripcion = "Prueba de descripcion del producto";
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre= " + nombre + ", precio=" + precio + ", descripcion=" + descripcion + '}';
    }
}