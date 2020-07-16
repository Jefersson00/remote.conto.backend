package local.conto.backend.ejb;

import java.util.Optional;

import javax.ejb.Remote;

import local.conto.backend.dto.ClienteDTO;

@Remote
public interface ClienteEjbRemote {
	
	
	Boolean insertCliente(Optional<ClienteDTO> clienteDTO);
	Optional<ClienteDTO> getClientebyId(Integer id);
	Boolean deleteCliente(Integer id);
}
