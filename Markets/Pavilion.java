package MarketTask.Markets;

public class Pavilion extends Market {
    private final int STATE_TAX = 50;

    public Pavilion(String name, String address, int area) {
        super(name, address, area);
    }

    @Override
    protected void setArea(int area) {
        if (!(area >= 2 || area <= 10)) {
            throw new IllegalArgumentException("The area is not correct value for the pavilion");
        }
        super.setArea(area);
    }

    @Override
    public int addStateTax() {
        return STATE_TAX;
    }
}



