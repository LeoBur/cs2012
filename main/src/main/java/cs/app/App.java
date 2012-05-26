package cs.app;

import cs.modelo.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("main");
    	EntityManager em = emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	em.getTransaction().commit();
    	
        System.out.println( "Hello World!" );
    }
}
