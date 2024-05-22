/**
 * 
 */
package br.com.icorrea.dao.jpa;

import br.com.icorrea.dao.generic.jpa.GenericJpaDAO;
import br.com.icorrea.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
