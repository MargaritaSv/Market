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

    public Ambulatory(String name, String address, double capital) {
        super(name, address, capital);
    }

    @Override
    public void setMarkets(Market[] markets) {
        super.setMarkets(markets);
    }

    public void setProvider(Provider provider) {
        if (provider == null) {
            throw new IllegalArgumentException("The name is not valid.");
        }

        if (!(provider.getTypeProviders().equals(TypeProviders.PROVIDERTORETAIL))) {
            throw new IllegalArgumentException("This type provider is not for You.");
        }
        super.setProvider(provider);
    }

    @Override
    public String toString() {
        return "Ambulatory:" + super.toString();
    }
}