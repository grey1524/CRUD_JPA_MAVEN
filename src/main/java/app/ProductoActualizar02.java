package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Producto;


public class ProductoActualizar02 {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		
		Producto p = em.find(Producto.class, "P0020");
		
		if (p == null) {
			System.out.println("El porducto no existe");
		} else {
			
			p.setDescripcion("Diclofenaco");
			p.setEstock(10);
			p.setPrecio("1.60");
			p.setIdcategoria(1);
			p.setEstproducto(1);
			p.setIdproveedor(1);
			
			em.getTransaction().begin();
			em.merge(p);
			em.getTransaction().commit();
			System.out.println("Producto actualizado: " + p);
			em.close();
			

		}
		
	}

}
