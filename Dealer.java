package MarketTask;

public abstract class Dealer extends BaseInfo {

	
	private double capital;

	public Dealer(String name, String addres, double capital) {
		super(name,addres);
		this.setCapital(capital);
		
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
