package MarketTask;

import MarketTask.Markets.Magazine;
import MarketTask.Markets.Market;

/**
 * Created by Magi on 23.7.2016 г..
 */
public interface IDealer {
    public abstract void payStateTax();

    public abstract void takeTurnoverOfShop();

    public abstract void makeOrder();
}
