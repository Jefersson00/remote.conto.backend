package local.conto.backend.dto;

public class ContoDTO {
	
	private Integer id;
	private String iban;
	private Integer idCliente;
	
	public ContoDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param iban
	 * @param idCliente
	 */
	public ContoDTO(Integer id, String iban, Integer idCliente) {
		super();
		this.id = id;
		this.iban = iban;
		this.idCliente = idCliente;
	}

	/**
	 * @param iban
	 * @param idCliente
	 */
	public ContoDTO(String iban, Integer idCliente) {
		super();
		this.iban = iban;
		this.idCliente = idCliente;
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
	 * @return the iban
	 */
	public String getIban() {
		return iban;
	}

	/**
	 * @param iban the iban to set
	 */
	public void setIban(String iban) {
		this.iban = iban;
	}

	/**
	 * @return the idCliente
	 */
	public Integer getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "ContoB [id=" + id + ", iban=" + iban + ", idCliente=" + idCliente + "]";
	}
	
	
	
	
}
