package cs.app;

import javax.ejb.EJB;
import cs.negocio.AdministradorClientesService;
import cs.modelo.Cliente;

public class Tester {
	@EJB
	private AdministradorClientesService admClientes;
	
	public void TestCliente( )
	{
		Cliente c = new Cliente( );
		c.setId((long) 10);
		c.setDni((long)36025649);
		c.setNombre("Luis");
		c.setCuil("23-36025649-3");
		
		admClientes.darDeAlta(c);
	}
}
