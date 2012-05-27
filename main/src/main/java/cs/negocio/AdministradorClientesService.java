package cs.negocio;

import cs.modelo.Cliente;

/**
 * 
 * Interfaz para administrar clientes (ej: alta, baja, modificación)
 *
 */
public interface AdministradorClientesService {
	/**
	 * Da de alta un nuevo cliente
	 * @param cliente El que cliente que se va a dar de alta
	 */
	void darDeAlta(Cliente cliente);
}
