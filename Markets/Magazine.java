package MarketTask.Markets;

public class Magazine extends Market {

    private final int STATE_TAX = 150;

    public Magazine(String name, String address, int area) {
        super(name, address, area);

    }

    @Override
    public void setArea(int area) {
        if (!(area >= 10 || area <= 100)) {
            throw new IllegalArgumentException("The area is not correct value for the pavilion");
        }
        super.setArea(area);
    }

    @Override
    public int addStateTax() {
        return STATE_TAX;
    }
}