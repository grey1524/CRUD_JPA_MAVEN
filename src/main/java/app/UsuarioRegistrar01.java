package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class UsuarioRegistrar01 {
	public static void main(String[] args) {
		try {
			// 1. fabrica el acceco a los datos (similar a DAOFactory)
			EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");

			// 2. crea el manejador de entidades (similar a crear el obj DAO)
			EntityManager em = fabrica.createEntityManager();

			// 3. empezar mi transaccion (procesos)
			Usuario u = new Usuario();
			u.setCodigo(11);
			u.setNombre("Paul");
			u.setApellido("Alayo");
			u.setUsuario("paul@gmial.com");
			u.setClave("1235");
			u.setFnacim("1990/09/24");
			u.setTipo(2);
			u.setEstado(1);

			// 4. confirmar la transaccion
			em.getTransaction().begin();
			em.persist(u);
			em.getTransaction().commit();
			em.close();
		} catch (Exception e) {
			// Manejo de excepciones
			e.printStackTrace();
		}

	}

}
