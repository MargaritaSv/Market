package MarketTask.Markets;

public abstract class Market {
    private String name;
    private String address;
    protected int area;
    protected int stateTax;

    public Market(String name, String address, int area, int stateTax) {
        this.setName(name);
        this.setAddress(address);
        this.setArea(area);
        this.setStateTax(stateTax);
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

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        if (address == null || address.trim().length() == 0) {
            System.out.println("The address is not correct.");
        }

        this.address = address;
    }

    protected void setArea(int area) {
        this.area = area;
    }

    protected void setStateTax(int stateTax) {
        this.stateTax = stateTax;
    }
}