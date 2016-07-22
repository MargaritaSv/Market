package MarketTask;

public abstract class BaseInfo {
	private String name;
	private String address;

	public BaseInfo(String name, String address) {
		super();
		this.setName(name);
		this.setAddres(address);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if (name == null || name.trim().length() == 0) {
			System.out.println("The name is not correct.");
		}
		this.name = name;
	}

	public String getAddres() {
		return address;
	}

	private void setAddres(String address) {
		if (address == null || address.trim().length() == 0) {
			System.out.println("The address is not correct.");
		}

		this.address = address;
	}
}
