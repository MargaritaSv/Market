package MarketTask.DealersObjects;

import MarketTask.Dealer;
import MarketTask.Markets.Market;
import MarketTask.Provider;

public class MarketingChaining extends Dealer {

    public MarketingChaining(String name, String address, double capital, Market[] markets, Provider[] providers) {
        super(name, address, capital, markets, providers);
    }

    public MarketingChaining(String name, String address, double capital) {
        super(name, address, capital);
        this.markets = new Market[12];
        this.provider = new Provider[6];
    }

    @Override
    public void setMarkets(Market[] markets) {
        if (markets.length > 12) {
            throw new IllegalArgumentException("Marketing chaining can have only 12 markets.");
        }

        super.setMarkets(markets);
    }

    @Override
    public void setProvider(Provider[] provider) {
        if (provider.length > 6) {
            throw new IllegalArgumentException("Marketing chaining can have only 6 providers.");
        }
        super.setProvider(provider);
    }
}