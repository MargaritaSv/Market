package MarketTask;

import MarketTask.Markets.Market;

public abstract class Dealer extends BaseInfo implements IDealer {
    private double capital;
    protected Market[] markets;
    protected Provider[] provider;

    public Dealer(String name, String address, double capital, Market[] markets, Provider[] provider) {
        super(name, address);
        this.setCapital(capital);
        this.setMarkets(markets);
        this.setProvider(provider);
    }

    public Dealer(String name, String address, double capital) {
        super(name, address);
        this.setCapital(capital);
    }

    public double getCapital() {
        return capital;
    }

    protected void setCapital(double capital) {
        if (capital < 0.0) {
            System.out.println("The value must be positive number.");
        }
        this.capital = capital;
    }

    public void setMarkets(Market[] markets) {
        this.markets = markets;
    }

    public void setProvider(Provider[] provider) {
        this.provider = provider;
    }
}