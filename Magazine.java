package MarketTask.Markets;

public class Magazine extends Market {

    public Magazine(String name, String address, int area, int stateTax) {
        super(name, address, area, stateTax);
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
        if (stateTax != 150) {
            throw new IllegalArgumentException("The state tax is not correct for the pavilion");
        }
        super.setStateTax(stateTax);
    }
}
