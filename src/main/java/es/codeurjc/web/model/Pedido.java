package es.codeurjc.web.model;
import es.codeurjc.web.service.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

@Entity
public class Pedido {

	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double precio;
    public double suma;
    private String nombre;
    private String Apellido;
    private Long Telefono;
    private String Mail;
    private String Direccion;
    private int CP;

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Long getTelefono() {
        return Telefono;
    }

    public void setTelefono(Long telefono) {
        Telefono = telefono;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int cP) {
        CP = cP;
    }


      

    @ManyToOne
    private Usuario usuario;

    @ManyToMany
	private  List<Producto> listaProductos  = new ArrayList<>(); 


    public Pedido() {

    }

      public double getPrecio() {
        return precio;
       
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        
        
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }
  
    public double getSuma() {
    return suma;
    }
    
    }

