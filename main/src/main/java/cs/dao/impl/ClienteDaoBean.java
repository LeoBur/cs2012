package cs.dao.impl;

import javax.ejb.Local;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cs.dao.ClienteDaoService;
import cs.modelo.Cliente;

/**
 * Implementación de ClienteDaoService
 */
@Stateless
@Local(ClienteDaoService.class)
public class ClienteDaoBean implements ClienteDaoService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Cliente findById(Long id) {
		return entityManager.find(Cliente.class, id);
	}

	public void save(Cliente cliente) {
		entityManager.persist(cliente);
	}
}
