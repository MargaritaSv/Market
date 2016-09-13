package MarketTask;

import java.util.LinkedHashMap;
import java.util.Map;

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

    private String printProducts() {
        StringBuilder sB = new StringBuilder();
        sB.append(System.lineSeparator()).append("Products:").append(System.lineSeparator());
        for (Map.Entry<String, Integer> pr : products.entrySet()) {
            sB.append(pr.getKey()).append(" - ").append(pr.getValue()).append("$");
            sB.append(System.lineSeparator());
        }
        return sB.toString();
    }

    @Override
    public String toString() {
        String listProducts = printProducts();
        return "Provider:" + super.toString() + "working hours-" + workingHours + ", type: " + typeProviders + listProducts;
    }
}