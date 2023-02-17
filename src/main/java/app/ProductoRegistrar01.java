package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Producto;

public class ProductoRegistrar01 {
	public static void main(String[] args) {
		try {
			EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
			EntityManager em = fabrica.createEntityManager();

			Producto p = new Producto();
			p.setIdprod("P0021");
			p.setDescripcion("Diclofenaco");
			p.setEstock(100);
			p.setPrecio("1.50");
			p.setIdcategoria(1);
			p.setEstproducto(1);
			p.setIdproveedor(1);

			em.getTransaction().begin();
			em.persist(p);
			em.getTransaction().commit();
			em.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
