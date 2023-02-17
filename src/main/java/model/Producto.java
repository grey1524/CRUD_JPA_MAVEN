package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_productos")
public class Producto {

	@Id
	@Column(name = "id_prod")
	private String idprod;

	@Column(name = "des_prod")
	private String descripcion;

	@Column(name = "stk_prod")
	private int estock;

	@Column(name = "pre_prod")
	private String precio;

	@Column(name = "idcategoria")
	private int idcategoria;

	@Column(name = "est_prod")
	private int estproducto;

	@Column(name = "idproveedor")
	private int idproveedor;

	@Override
	public String toString() {
		return "Productos [idprod=" + idprod + ", descripcion=" + descripcion + ", estock=" + estock + ", precio="
				+ precio + ", idcategoria=" + idcategoria + ", estproducto=" + estproducto + ", idproveedor="
				+ idproveedor + "]";
	}

	public Producto() {
		super();
	}

	public Producto(String idprod, String descripcion, int estock, String precio, int idcategoria, int estproducto,
			int idproveedor) {
		super();
		this.idprod = idprod;
		this.descripcion = descripcion;
		this.estock = estock;
		this.precio = precio;
		this.idcategoria = idcategoria;
		this.estproducto = estproducto;
		this.idproveedor = idproveedor;
	}

	public String getIdprod() {
		return idprod;
	}

	public void setIdprod(String idprod) {
		this.idprod = idprod;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getEstock() {
		return estock;
	}

	public void setEstock(int estock) {
		this.estock = estock;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public int getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public int getEstproducto() {
		return estproducto;
	}

	public void setEstproducto(int estproducto) {
		this.estproducto = estproducto;
	}

	public int getIdproveedor() {
		return idproveedor;
	}

	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}

}
