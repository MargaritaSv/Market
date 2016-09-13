package MarketTask.DealersObjects;

import MarketTask.Dealer;
import MarketTask.Markets.Market;
import MarketTask.Provider;
import MarketTask.TypeProviders;

public class Ambulatory extends Dealer {

    public Ambulatory(String name, String address, double capital, Market[] markets, Provider[] provider) {
        super(name, address, capital, markets, provider);
    }

    public Ambulatory(String name, String address, double capital, Provider[] provider) {
        super(name, address, capital);
        this.setProvider(provider);
        this.setMarkets(new Market[150]);
    }

    @Override
    public void setMarkets(Market[] markets) {
        super.setMarkets(markets);
    }

    @Override
    public void setProvider(Provider[] provider) {
        if (provider[0] == null) {
            throw new IllegalArgumentException("The name is not valid.");
        }
        if (!(provider[0].getTypeProviders().equals(TypeProviders.PROVIDERTORETAIL))) {
            throw new IllegalArgumentException("This type provider is not for You.");
        }
        super.setProvider(provider);
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



}
