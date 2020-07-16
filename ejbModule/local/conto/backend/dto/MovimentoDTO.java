package local.conto.backend.dto;

import java.util.Date;

public class MovimentoDTO {
	
	private Integer id;
//	private Date dataMovimento;
	private Integer ammontare;
	private Integer idConto;
	
	
	public MovimentoDTO() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param id
	 * @param ammontare
	 * @param idConto
	 */
	public MovimentoDTO(Integer id, Integer ammontare, Integer idConto) {
		super();
		this.id = id;
		this.ammontare = ammontare;
		this.idConto = idConto;
	}


	/**
	 * @param ammontare
	 * @param idConto
	 */
	public MovimentoDTO(Integer ammontare, Integer idConto) {
		super();
		this.ammontare = ammontare;
		this.idConto = idConto;
	}


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @return the ammontare
	 */
	public Integer getAmmontare() {
		return ammontare;
	}


	/**
	 * @param ammontare the ammontare to set
	 */
	public void setAmmontare(Integer ammontare) {
		this.ammontare = ammontare;
	}


	/**
	 * @return the idConto
	 */
	public Integer getIdConto() {
		return idConto;
	}


	/**
	 * @param idConto the idConto to set
	 */
	public void setIdConto(Integer idConto) {
		this.idConto = idConto;
	}


	@Override
	public String toString() {
		return "MovimentoB [id=" + id + ", ammontare=" + ammontare + ", idConto=" + idConto + "]";
	}
	
	
}
