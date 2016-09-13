package MarketTask;

import java.util.LinkedHashMap;

public class Provider extends BaseInfo {

    private int workingHours;
    private TypeProviders typeProviders;
    private LinkedHashMap<String, Integer> products;

    public Provider(String name, String address, int workingHours, TypeProviders typeProviders) {
        super(name, address);
        this.setWorkingHours(workingHours);
        this.typeProviders = typeProviders;
        this.products = new LinkedHashMap<>();
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

    public LinkedHashMap<String, Integer> getProducts() {
        return products;
    }

    public void setProducts(LinkedHashMap<String, Integer> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Provider:" + super.toString()+
                "workingHours=" + workingHours +
                ", typeProviders=" + typeProviders +
                ", products=" + products +
                '}';
    }
}
