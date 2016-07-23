package MarketTask.Markets;

public class PavilionStreet extends Market {

    public PavilionStreet(String name, String address, int area, int stateTax) {
        super(name, address, area, stateTax);

    }

    @Override
    public void setArea(int area) {
        if (!(area >= 4 || area <= 6)) {
            throw new IllegalArgumentException("The area is not correct value for the pavilion");
        }
        super.setArea(area);
    }

    @Override
    public void setStateTax(int stateTax) {
        if (stateTax != 50) {
            throw new IllegalArgumentException("The state tax is not correct for the pavilion");
        }
        super.setStateTax(stateTax);
    }
}
