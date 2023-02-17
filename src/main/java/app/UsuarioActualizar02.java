package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class UsuarioActualizar02 {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		

		Usuario u = em.find(Usuario.class, 6);
		
		if (u == null) {
			System.out.println("El Usuario no existe");
		} else {
			u.setNombre("Carlitos");
			u.setApellido("Ramos");
			u.setUsuario("ramos@gmail.com");
			u.setClave("12345");
			u.setFnacim("1990/09/24");
			u.setTipo(2);
			u.setEstado(1);

			em.getTransaction().begin();
			em.merge(u); // <---- Actualiza -> si existe el codigo / registra un nuevo dato
			em.getTransaction().commit();
			System.out.println("Usuario actualizado: " + u);
			em.close();

		}
		

	}

}
