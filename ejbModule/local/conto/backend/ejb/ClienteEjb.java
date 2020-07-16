package local.conto.backend.ejb;

import java.util.Optional;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import academy.conto.persistence.dao.ClienteDao;
import academy.conto.persistence.entity.Cliente;
import local.conto.backend.builder.ClienteBuilder;
import local.conto.backend.dto.ClienteDTO;

/**
 * Session Bean implementation class ClienteEjb
 */
@Stateless
@LocalBean
public class ClienteEjb implements ClienteEjbRemote, ClienteEjbLocal {

	@PersistenceContext(unitName = "Hib4Conto")
	private EntityManager em;

	private ClienteDao clienteDao = new ClienteDao(em);
	private ClienteBuilder clienteBuilder = new ClienteBuilder();
	
	/**
	 * Default constructor.
	 */
	public ClienteEjb() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean insertCliente(Optional<ClienteDTO> clienteDTO) {

//		clienteBuilder.clienteBToClient(clienteBean)
		Optional<Cliente> cliente = clienteBuilder.clienteDTOToClient(clienteDTO);

		try {
			return clienteDao.insertCliente(cliente.get());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Errore nella chiamata del dao InsertCliente return:" + false);
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public Optional<ClienteDTO> getClientebyId(Integer id) {

//		clienteBuilder.clienteBToClient(clienteBean)
		Optional<ClienteDTO> clienteDTO = Optional.empty();
		try {

			clienteDTO = clienteBuilder.clienteToClienteDTO(Optional.ofNullable(clienteDao.selectById(id)));
			return clienteDTO;
		} catch (Exception e) {

			// TODO Auto-generated catch block
			System.out.println("Errore nella chiamata del dao getCLienteById return:" + false);
			e.printStackTrace();
			return Optional.empty();
		}
	}
	
	
	@Override
	public Boolean deleteCliente(Integer id) {

		
		try {
			return clienteDao.removeCliente(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Errore nella chiamata del daodeleteCliente return:" + false);
			e.printStackTrace();
			return false;
		}
		
	}
	
	
}
