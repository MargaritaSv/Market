package MarketTask;

public abstract class Dealer {

	private String name;
	private String addres;
	private double capital;

	public Dealer(String name, String addres, double capital) {
		this.setName(name);
		this.setAddres(addres);
		this.setCapital(capital);
		
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
		return addres;
	}

	private void setAddres(String addres) {
		if (addres == null || addres.trim().length() == 0) {
			System.out.println("The address is not correct.");
		}

		this.addres = addres;
	}

	public double getCapital() {
		return capital;
	}

	private void setCapital(double capital) {
		if (capital < 0.0) {
			System.out.println("The value must be positive number.");
		}
		this.capital = capital;
	}

}
