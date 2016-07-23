package MarketTask.DealersObjects;

import MarketTask.Dealer;
import MarketTask.Markets.Market;
import MarketTask.Markets.Pavilion;
import MarketTask.Markets.PavilionStreet;
import MarketTask.Provider;

public class ET extends Dealer {
    private Provider[] providers;
    private Market market;

    public ET(String name, String address, double capital) {
        super(name, address, capital);
        this.providers = new Provider[6];
        this.setMarket(market);
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        if (!(market instanceof Pavilion) && !(market instanceof PavilionStreet)) {
            System.out.println("The market is not possible");
        }
        this.market = market;
    }

    public void setProviders(Provider[] providers) {
        this.providers = providers;
    }
}
