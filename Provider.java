package MarketTask;

public class Provider extends BaseInfo {

    private int workingHours;
    private TypeProviders typeProviders;

    public Provider(String name, String address, int workingHours, TypeProviders typeProviders) {
        super(name, address);
        this.setWorkingHours(workingHours);
        this.typeProviders=typeProviders;
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

    public TypeProviders getTypeProviders() {
        return typeProviders;
    }
}
