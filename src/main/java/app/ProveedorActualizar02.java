package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Proveedor;

public class ProveedorActualizar02 {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		
		Proveedor p = em.find(Proveedor.class, 4);
		
		if (p == null) {
			System.out.println("El Proveedor no existe");
		} else {
			p.setNombre("AndesCO");
			p.setTelefono("940471376");
			p.setCorreo("andesco@gmail.com");
			
			em.getTransaction().begin();
			em.merge(p);
			em.getTransaction().commit();
			em.close();

		}
	}

}
