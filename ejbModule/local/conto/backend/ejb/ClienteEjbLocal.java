package local.conto.backend.ejb;

import java.util.Optional;

import javax.ejb.Local;

import local.conto.backend.dto.ClienteDTO;

@Local
public interface ClienteEjbLocal {

	Boolean insertCliente(Optional<ClienteDTO> clienteBean);

	Optional<ClienteDTO> getClientebyId(Integer id);

	Boolean deleteCliente(Integer id);


}
