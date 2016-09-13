package MarketTask;

import MarketTask.BaseInfo;
import MarketTask.IDealer;
import MarketTask.Markets.Market;
import MarketTask.Provider;

import java.util.Arrays;

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

    public void setProvider(Provider... provider) {
        this.provider = provider;
    }

    @Override
    public void takeTurnoverOfShop() {

    }

    @Override
    public void makeOrder() {

    }

    @Override
    public void payStateTax() {
        if (this.getCapital() <= 0.0) {
            throw new IllegalArgumentException("The capital is not enough.");
        }

        for (int i = 0; i < markets.length; i++) {

            if (markets[i].getStateTax() > this.getCapital()) {
                if (this.getCapital() < 0.0) {
                    this.setCapital(0.0);
                }
                throw new IllegalArgumentException("The capital is not enough.");
            }

            this.setCapital((this.getCapital() - (double) markets[i].getStateTax()));
        }
    }

    @Override
    public String toString() {
        return super.toString() + "capital=" + capital + System.lineSeparator() +
                "Markets=" + Arrays.toString(markets) + System.lineSeparator() +
                "Provider:" + Arrays.toString(provider);
    }
}