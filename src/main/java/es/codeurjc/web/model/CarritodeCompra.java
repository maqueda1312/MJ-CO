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
	private long id;
	
	@OneToOne (mappedBy="carrito")
	private Usuario usuario;
	
	@ManyToMany
	private  List<Producto> listaProductos = new ArrayList<>(); 



	public CarritodeCompra(){}


	public  List<Producto> getListaProductos() {
		return listaProductos;
	}

	
	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	

	@Override
	public String toString() {
		return "CarritoCompra" + listaProductos + "\n";
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
