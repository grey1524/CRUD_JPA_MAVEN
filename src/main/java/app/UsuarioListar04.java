package app;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Usuario;

public class UsuarioListar04 {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		
		TypedQuery<Usuario> t = em.createQuery("SELECT u FROM Usuario u", Usuario.class);
		List<Usuario> lstUsuarios = t.getResultList();
		System.out.println("Cantidad de Usuarios: " + lstUsuarios.size());
	
		for (Usuario u : lstUsuarios) {
			System.out.println("Siguiente Usuario: " + u);
		}
	}
	

}
