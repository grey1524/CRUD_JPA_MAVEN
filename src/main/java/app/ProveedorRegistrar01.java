package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Proveedor;

public class ProveedorRegistrar01 {
	public static void main(String[] args) {
		try {
			
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		
		Proveedor p = new Proveedor();
		p.setIdproveedor(5);
		p.setNombre("AndesCO");
		p.setTelefono("940471376");
		p.setCorreo("andesco@gmail.com");
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
