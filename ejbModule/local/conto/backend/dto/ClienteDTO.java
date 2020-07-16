package local.conto.backend.dto;

public class ClienteDTO {
	
	private Integer id;
	private String name;
	private String lastname;

	public ClienteDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param lastname
	 */
	public ClienteDTO(Integer id, String name, String lastname) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
	}

	/**
	 * @param name
	 * @param lastname
	 */
	public ClienteDTO(String name, String lastname) {
		super();
		this.name = name;
		this.lastname = lastname;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "ClienteB [id=" + id + ", name=" + name + ", lastname=" + lastname + "]";
	}
	
	
}
