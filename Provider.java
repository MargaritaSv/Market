package MarketTask;

public class Provider extends BaseInfo {
	
	private int workingHours;

	public Provider(String name, String address, int workingHours) {
		super(name, address);
		this.workingHours = workingHours;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if (workingHours < 1 || workingHours >= 24) {
			System.out.println("The hours is not correct [1-23]");
		}
		this.workingHours = workingHours;
	}

}
