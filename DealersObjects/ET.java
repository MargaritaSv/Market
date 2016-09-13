package MarketTask.DealersObjects;

import MarketTask.Dealer;
import MarketTask.Markets.Market;
import MarketTask.Markets.Pavilion;
import MarketTask.Markets.PavilionStreet;
import MarketTask.Provider;

public class ET extends Dealer {

    public ET(String name, String address, double capital, Market[] market, Provider[] providers) {
        super(name, address, capital, market, providers);
        this.setMarkets(market);
        this.setProvider(providers);
    }

    public ET(String name, String address, double capital, Market[] market) {
        super(name, address, capital);
        this.setMarkets(market);
        this.setProvider(new Provider[5]);
    }

    public ET(String name, String address, double capital) {
        super(name, address, capital);
    }

    @Override
    public void setMarkets(Market[] markets) {
        if (markets[0] == null || markets.length > 1) {
            System.out.println("The market is not correct.");
        }

        if (!(markets[0] instanceof Pavilion) && !(markets[0] instanceof PavilionStreet)) {
            System.out.println("The market is not possible");
        }
        super.setMarkets(markets);
    }

    @Override
    public void setProvider(Provider[] provider) {
        if (provider.length > 5) {
            System.out.println("ET has 5 providers");
        }
        super.setProvider(provider);
    }

    @Override
    public void payStateTax() {
        double taxForMarket = (double) markets[0].getStateTax();
        if (taxForMarket > this.getCapital()) {
            throw new IllegalArgumentException("The capital is not enough.");

        }
        this.setCapital((this.getCapital() - (double) markets[0].getStateTax()));
    }
}