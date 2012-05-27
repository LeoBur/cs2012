package cs.dao;

import cs.modelo.Cliente;

/**
 * 
 * Interfaz DAO para Cliente
 *
 */
public interface ClienteDaoService {
	/**
	 * Busca un cliente por id
	 * @param id Id del cliente que se busca
	 * @return El cliente cuyo Id es id. Null en caso de no encontrarse.
	 */
	Cliente findById( Long id );
	
	/**
	 * Guarda un nuevo cliente
	 * @param cliente Nuevo cliente
	 */
	void save( Cliente cliente );
}
