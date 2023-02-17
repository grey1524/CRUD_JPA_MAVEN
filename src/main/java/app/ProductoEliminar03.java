package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Producto;

public class ProductoEliminar03 {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		Producto p = em.find(Producto.class, "P0021");

		if (p == null) {
			System.out.println("El Producto no existe");
		} else {
			System.out.println();
			em.getTransaction().begin();
			em.remove(p);
			em.getTransaction().commit();
			System.out.println("Producto eliminado");
		}
		em.close();
	}

}
