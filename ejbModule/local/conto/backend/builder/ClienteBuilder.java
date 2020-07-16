package local.conto.backend.builder;

import java.util.Optional;

import academy.conto.persistence.entity.Cliente;
import local.conto.backend.dto.ClienteDTO;

public class ClienteBuilder {

	public ClienteBuilder() {
		// TODO Auto-generated constructor stub
	}

	public Optional<ClienteDTO> clienteToClienteDTO(Optional<Cliente> cliente) {

		Optional<ClienteDTO> clienteDTO = Optional.empty();
		
		clienteDTO.get().setId(cliente.get().getId()==null?null:cliente.get().getId());
		clienteDTO.get().setName(cliente.get().getName().equals(null)?"":cliente.get().getName());
		clienteDTO.get().setLastname(cliente.get().getLastname().equals(null)?"":cliente.get().getLastname());
		return clienteDTO;
	}

	public Optional<Cliente> clienteDTOToClient(Optional<ClienteDTO> clienteDTO) {

		Optional<Cliente> cliente = Optional.empty();
		
		cliente.get().setId(clienteDTO.get().getId()==null?null:clienteDTO.get().getId());
		cliente.get().setName(clienteDTO.get().getName().equals(null)?"":clienteDTO.get().getName());
		cliente.get().setLastname(clienteDTO.get().getLastname().equals(null)?"":clienteDTO.get().getLastname());
		return cliente;
	}
}
