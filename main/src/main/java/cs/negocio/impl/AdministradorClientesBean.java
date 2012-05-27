package cs.negocio.impl;

import cs.modelo.Cliente;
import cs.negocio.AdministradorClientesService;
import cs.dao.ClienteDaoService;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.Local;

/**
 * Implementación del servicio AdministradorClientes
 *
 */
@Stateless
@Local(AdministradorClientesService.class)
public class AdministradorClientesBean implements AdministradorClientesService {
	
	@EJB
	private ClienteDaoService dao;
	
	public void darDeAlta(Cliente cliente) {
		dao.save(cliente);
	}
}
