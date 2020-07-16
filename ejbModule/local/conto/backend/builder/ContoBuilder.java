package local.conto.backend.builder;

import java.util.Optional;

import academy.conto.persistence.entity.Conto;
import local.conto.backend.dto.ContoDTO;

public class ContoBuilder {

	public ContoBuilder() {
		// TODO Auto-generated constructor stub
	}

	public Optional<ContoDTO> contoToContoDTO(Optional<Conto> conto) {

		Optional<ContoDTO> contoDTO = Optional.empty();
		contoDTO.get().setId(conto.get().getId()==null?null:conto.get().getId());
		contoDTO.get().setIdCliente(conto.get().getIdCliente()==null?null:conto.get().getIdCliente());
		contoDTO.get().setIban(conto.get().getIban().equals(null)?"":conto.get().getIban());

		return contoDTO;

	}

	public Optional<Conto> contoDTOToConto(Optional<ContoDTO> contoDTO) {

		Optional<Conto> conto = Optional.empty();
		
		conto.get().setId(contoDTO.get().getId()==null?null:contoDTO.get().getId());
		conto.get().setIdCliente(contoDTO.get().getIdCliente()==null?null:contoDTO.get().getIdCliente());
		conto.get().setIban(contoDTO.get().getIban().equals(null)?"":contoDTO.get().getIban());

		
		return conto;

	}

}
