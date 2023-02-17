package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_proveedor")
public class Proveedor {

	@Id
	@Column(name = "idproveedor")
	private int idproveedor;

	@Column(name = "nombre_rs")
	private String nombre;

	@Column(name = "telefono")
	private String telefono;

	@Column(name = "email")
	private String correo;

	@Override
	public String toString() {
		return "Proveedor [idproveedor=" + idproveedor + ", nombre=" + nombre + ", telefono=" + telefono + ", correo="
				+ correo + "]";
	}

	public Proveedor(int idproveedor, String nombre, String telefono, String correo) {
		super();
		this.idproveedor = idproveedor;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
	}

	public Proveedor() {
		super();
	}

	public int getIdproveedor() {
		return idproveedor;
	}

	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
