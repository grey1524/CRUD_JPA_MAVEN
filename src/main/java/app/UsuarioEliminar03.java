package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class UsuarioEliminar03 {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		Usuario u = em.find(Usuario.class, 13);

		if (u == null) {
			System.out.println("Usaurio no existe");
		} else {
			System.out.println(u);
			em.getTransaction().begin();
			em.remove(u);// <-- eliminar
			em.getTransaction().commit();
			System.out.println("Usuario eliminado");
		}
		em.close();
	}

}
