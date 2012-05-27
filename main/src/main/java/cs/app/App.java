package cs.app;

//import cs.modelo.Cliente;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
//    	Cliente c = new Cliente();
//    	c.setId((long)10);
//    	c.setDni((long)36025649);
//    	c.setCuil("23-36025649-3");
//    	c.setNombre("Luis Lezcano Airaldi");
    	
//    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("main");
//    	EntityManager em = emf.createEntityManager();
//    	
//    	em.getTransaction().begin();
//    	
//    	Cliente c = new Cliente();
//    	
//    	c.setId((long) 1 );
//    	c.setDni((long) 36025649);
//    	c.setCuil("23-36025649-3");
//    	c.setNombre("Luis Lezcano Airaldi");
//    	
//    	em.persist(c);
//    	
//    	em.getTransaction().commit();
    	
    	Tester t = new Tester();
    	t.TestCliente();
    	
        System.out.println( "Hello World!" );
    }
}
