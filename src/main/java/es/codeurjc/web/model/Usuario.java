package es.codeurjc.web.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "UserTable")

public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String correo;
	private String nombre;
	private String apellidos;
	private String direccion;

	public Usuario(String n, String a, String c, String d) {
		this.nombre = n;
		this.apellidos = a;
		this.correo = c;
		this.direccion = d;
		
	}
	public Usuario(String n, String a, String c, String d,int id) {
		this.nombre = n;
		this.apellidos = a;
		this.correo = c;
		this.direccion = d;
		this.id=id;
	}
	public Usuario() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


}