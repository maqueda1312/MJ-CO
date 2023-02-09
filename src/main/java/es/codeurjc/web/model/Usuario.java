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

	private Long id;
	private String mail;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String contrasena;

	public Usuario(String n, String a, String m, String d, String c) {
		this.nombre = n;
		this.apellidos = a;
		this.mail = m;
		this.direccion = d;
		this.contrasena = c;
		
	}
	public Usuario(String n, String a, String m, String d, String c,int id) {
		this.nombre = n;
		this.apellidos = a;
		this.mail = m;
		this.direccion = d;
		this.contrasena = c;
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
		return mail;
	}

	public void setCorreo(String correo) {
		this.mail = mail;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}