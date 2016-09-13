package MarketTask.Markets;

import MarketTask.BaseInfo;

public abstract class Market extends BaseInfo {

    protected int area;
    protected int stateTax;

    public Market(String name, String address, int area, int stateTax) {
        super(name, address);
        this.setArea(area);
        this.setStateTax(stateTax);
    }

    public int getStateTax() {
        return stateTax;
    }

    protected void setArea(int area) {
        this.area = area;
    }

    protected void setStateTax(int stateTax) {
        this.stateTax = stateTax;
    }
}