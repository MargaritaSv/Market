package MarketTask.DealersObjects;

import MarketTask.Dealer;
import MarketTask.Markets.Market;
import MarketTask.Provider;
import MarketTask.TypeProviders;

import java.util.ArrayList;

public class Ambulatory extends Dealer {

    private ArrayList<Market> markets;
    private Provider provider;

    public Ambulatory(String name, String address, double capital, Provider provider) {
        super(name, address, capital);
        this.markets = new ArrayList<>();
        this.setProvider(provider);
    }

    private ArrayList<Market> getMarkets() {
        return markets;
    }

    public void setMarkets(ArrayList<Market> markets) {
        this.markets = markets;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        if (provider == null) {
            throw new IllegalArgumentException("The name is not valid.");
        }
        if (!(provider.getTypeProviders().equals(TypeProviders.PROVIDERTORETAIL))) {
            throw new IllegalArgumentException("This type provider is not for You.");
        }

        this.provider = provider;
    }
}
