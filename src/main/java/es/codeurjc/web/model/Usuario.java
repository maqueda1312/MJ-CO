package es.codeurjc.web.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


	

@Entity(name = "UserTable")
public class Usuario {



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;
	private String name;
	private String mail;
	private String encodedPassword;
	
	@OneToOne (cascade=CascadeType.ALL)
	private CarritodeCompra carrito;

	@ElementCollection(fetch=FetchType.EAGER)
	private List<String> roles;

	public Usuario() {
	}

	public Usuario(String name, String mail, String encodedPassword, String... roles) {
		this.name = name;
		this.mail = mail;
		this.encodedPassword = encodedPassword;
		this.roles = List.of(roles);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getEncodedPassword() {
		return encodedPassword;
	}

	public void setEncodedPassword(String encodedPassword) {
		this.encodedPassword = encodedPassword;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public CarritodeCompra getCarrito() {
		return carrito;
	}

	public void setCarrito(CarritodeCompra carrito) {
		this.carrito = carrito;
	}

	

}