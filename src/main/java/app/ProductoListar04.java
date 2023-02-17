package app;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Producto;

public class ProductoListar04 {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		
		TypedQuery<Producto> t = em.createQuery("SELECT p FROM Producto p", Producto.class);
		List<Producto> lstProducto = t.getResultList();
		System.out.println("Cantidad de Productos: " + lstProducto.size());
		
		for (Producto p : lstProducto) {
			System.out.println("Siguiente producto: " + p);
		}
	}

}
