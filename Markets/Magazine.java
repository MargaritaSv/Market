package MarketTask.Markets;

public class Magazine extends Market {

    private  final int STATE_TAX = 150;

    public Magazine(String name, String address, int area, int stateTax) {
        super(name, address, area, stateTax);
    }

    public  int getStateTax() {
        return STATE_TAX;
    }

    @Override
    public void setArea(int area) {
        if (!(area >= 10 || area <= 100)) {
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