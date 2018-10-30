package application;

public class VLAN {

	private int id = 0;
	private String name = "";
	private String ip = "";

	/**
	 * @param id   ID of the VLAN
	 * @param name Name of the VLAN
	 * @param ip   IP Address of the VLAN
	 */
	public VLAN(int id, String name, String ip) {
		super();
		this.id = id;
		this.name = name;
		this.ip = ip;
		if (!checkid(id)) {
			// hier sollte das Programm eine Fehlermeldung werfen
		}
		;
	}

	/**
	 * @return Returns the ID of the VLAN
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id Sets the ID of the VLAN
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return Returns the Name of the VLAN
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name Sets the Name of the VLAN
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Returns the IP of the VLAN
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip Sets the IP of the VLAN
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * Validates the ID of a VLAN
	 * 
	 * @param id The ID to validate
	 * @return Boolean if the ID is valid
	 */
	private boolean checkid(int id) {
		if (id >= 1 && id <= 4094) {
			return true;
		} else {
			return false;
		}
	}

}
