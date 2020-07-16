package local.conto.backend.builder;

import java.util.Optional;

import academy.conto.persistence.entity.Movimento;
import local.conto.backend.dto.MovimentoDTO;

public class MovimentoBuilder {

	public MovimentoBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	public Optional<MovimentoDTO> movimentoToMovimentoDTO(Optional<Movimento> movimento){
		Optional<MovimentoDTO> movimentoDTO =Optional.empty();
		
		movimentoDTO.get().setId(movimento.get().getId()==null?null:movimento.get().getId());
		movimentoDTO.get().setAmmontare(movimento.get().getAmmontare()==null?null:movimento.get().getAmmontare());
		movimentoDTO.get().setIdConto(movimento.get().getIdConto()==null?null:movimento.get().getIdConto());
		return movimentoDTO;
	}
	
	public Optional<Movimento> movimentoDTOToMovimento(Optional<MovimentoDTO> movimentoDTO){
		Optional<Movimento> movimento =Optional.empty();
		
		movimento.get().setId(movimentoDTO.get().getId()==null?null:movimentoDTO.get().getId());
		movimento.get().setAmmontare(movimentoDTO.get().getAmmontare()==null?null:movimentoDTO.get().getAmmontare());
		movimento.get().setIdConto(movimentoDTO.get().getIdConto()==null?null:movimentoDTO.get().getIdConto());
		return movimento;
	}
}
