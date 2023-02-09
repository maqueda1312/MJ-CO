package es.codeurjc.web.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;

@Entity
public class CarritodeCompra {
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne
	private Usuario usuario;
	
	@OneToMany
	private  List<Producto> listaProductos; 


	public CarritodeCompra() {
		
	}
	//POR DEFECTO CUANDO ENCIENDES LA PAGINA
	public CarritodeCompra(Usuario u){
		this.usuario=u;
		this.listaProductos = new ArrayList<>();
	}
	//FILTRADO POR USUARIO METIENDO UN PRODUCTO EN LA LISTA DEL CARRITO
	public CarritodeCompra(Usuario u,Producto x){
		this.usuario=u;
		this.listaProductos = new ArrayList<>();
		this.listaProductos.add(x);
	}
	
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

	public  List<Producto> getListaProductos() {
		return listaProductos;
	}

	
	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	@Override
	public String toString() {
		return "CarritoCompra [Usuario=" + usuario + ", Producto=" + listaProductos + "]";
	}

	
}
