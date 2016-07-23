package MarketTask.Markets;

public class Pavilion extends Market {
private  final int STATE_TAX = 50;

    public Pavilion(String name, String address, int area, int stateTax) {
        super(name, address,area,stateTax);
    }

    public  int getStateTax() {
        return STATE_TAX;
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
        if (stateTax != STATE_TAX) {
            throw new IllegalArgumentException("The state tax is not correct for the pavilion");
        }
        super.setStateTax(stateTax);
    }
 }



