package es.codeurjc.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Producto{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id = null;
    private String nombre;
    private double precio;
    @Column(columnDefinition = "TEXT")
    private String descripcion;



    public Producto(){
        
    }
    public Producto(String nombre, double precio, String descripcion){
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + "]";
    }
}


