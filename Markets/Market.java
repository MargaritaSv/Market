package MarketTask.Markets;

import MarketTask.BaseInfo;

public abstract class Market extends BaseInfo {

    protected int area;
    private int stateTax;

    public Market(String name, String address, int area) {
        super(name, address);
        this.setArea(area);
        this.stateTax = addStateTax();
    }

    public int getStateTax() {
        return stateTax;
    }

    protected void setArea(int area) {
        this.area = area;
    }

    public abstract int addStateTax();

    @Override
    public String toString() {
        return super.toString() + " area: " + this.area + " tax: " + this.stateTax;
    }
}