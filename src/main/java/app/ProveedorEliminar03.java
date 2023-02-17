package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Proveedor;

public class ProveedorEliminar03 {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		
		Proveedor p = em.find(Proveedor.class, 4);
		
		if (p == null) {
			System.out.println("El Proveedor no existe");
		} else {
			em.getTransaction().begin();
			em.remove(p);
			System.out.println("Proveedor eliminado correctamente");
			em.getTransaction().commit();
			em.close();

		}
	}

}
