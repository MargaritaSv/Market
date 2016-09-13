package MarketTask.Markets;

public class PavilionStreet extends Market {
    private final int STATE_TAX = 50;

    public PavilionStreet(String name, String address, int area) {
        super(name, address, area);
    }

    @Override
    public void setArea(int area) {
        if (!(area >= 4 || area <= 6)) {
            throw new IllegalArgumentException("The area is not correct value for the pavilion");
        }
        super.setArea(area);
    }

    @Override
    public int addStateTax() {
        return STATE_TAX;
    }
}
