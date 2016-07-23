package MarketTask.Markets;

public class PavilionStreet extends Market {
    private final int STATE_TAX = 50;

    public PavilionStreet(String name, String address, int area, int stateTax) {
        super(name, address, area, stateTax);

    }

    public int getStateTax() {
        return STATE_TAX;
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
        if (stateTax != STATE_TAX) {
            throw new IllegalArgumentException("The state tax is not correct for the pavilion");
        }
        super.setStateTax(stateTax);
    }
}
