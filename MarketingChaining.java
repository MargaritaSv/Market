package MarketTask.DealersObjects;

import MarketTask.Dealer;
import MarketTask.Markets.Market;
import MarketTask.Provider;

public class MarketingChaining extends Dealer {

    private Market[] markets;
    private Provider[] providers;

    public MarketingChaining(String name, String address, double capital) {
        super(name, address, capital);
        this.markets = new Market[12];
        this.providers = new Provider[6];
    }

    public Provider[] getProviders() {
        return providers;
    }

    public void setProviders(Provider[] providers) {
        this.providers = providers;
    }

    public Market[] getMarkets() {
        return markets;
    }

    public void setMarkets(Market[] markets) {
        this.markets = markets;
    }
}
