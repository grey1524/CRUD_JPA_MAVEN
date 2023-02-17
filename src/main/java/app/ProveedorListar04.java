package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import model.Proveedor;

public class ProveedorListar04 {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		
		TypedQuery<Proveedor> e = em.createQuery("SELECT p FROM Proveedor p", Proveedor.class);
		List<Proveedor> lstProveedor = e.getResultList();
		System.out.println("Cantidad de Proveedores: " + lstProveedor.size());
		
		for (Proveedor p : lstProveedor) {
			System.out.println("Siguiente Proveedor: " + p);
			
		}
	}

}
