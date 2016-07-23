package MarketTask.Markets;

public class Pavilion extends Market {

    public Pavilion(String name, String address, int area, int stateTax) {
        super(name, address,area,stateTax);
    }

    @Override
    protected void setArea(int area) {
        if (!(area >= 2 || area <= 10)) {
            throw new IllegalArgumentException("The area is not correct value for the pavilion");
        }
        super.setArea(area);
    }

    @Override
    protected void setStateTax(int stateTax) {
        if (stateTax != 50) {
            throw new IllegalArgumentException("The state tax is not correct for the pavilion");
        }
        super.setStateTax(stateTax);
    }
 }



