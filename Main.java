package MarketTask;

import MarketTask.DealersObjects.Ambulatory;
import MarketTask.DealersObjects.ET;
import MarketTask.DealersObjects.MarketingChaining;
import MarketTask.Markets.Magazine;
import MarketTask.Markets.Market;
import MarketTask.Markets.Pavilion;
import MarketTask.Markets.PavilionStreet;

public class Main {
    public static void main(String[] args) {


        Provider stefan = new Provider("Stefan", "Kaspichan", 6, TypeProviders.PROVIDERTORETAIL);
        Provider katq = new Provider("Katq", "Burgas", 6, TypeProviders.PROVIDERTORETAIL);
        Provider terry = new Provider("Terry", "Varna", 4, TypeProviders.WHOLESALESUPPLIER);


        Pavilion pavilion = new Pavilion("Сергия", "София ж.к. Дружба", 5, 50);
        PavilionStreet pavilion1 = new PavilionStreet("Сергия1", "София ж.к. Люлин", 6, 50);
        Magazine magazine = new Magazine("Kozmetika", "Sharo 34", 80, 150);
        Magazine fruits = new Magazine("Plodove", "Plovdiv", 70, 150);
        Magazine vegetables = new Magazine("Plodove", "Plovdiv", 70, 150);
        Magazine patatos = new Magazine("Plodove", "Plovdiv", 70, 150);


        Dealer georgi = new MarketingChaining("Georgy", "Pozitano 25", 250.0);
        ET magi = new ET("Daisy", "Sofiq ", 700.00, new Market[]{pavilion});

        MarketingChaining billa = new MarketingChaining("Billa", "Plovdiv", 7000.0);
        billa.setMarkets(new Market[]{fruits, vegetables, patatos});

        Ambulatory zlati = new Ambulatory("Zlati", "Lovech", 8900.0, new Provider[]{katq});
        zlati.setMarkets(new Market[]{fruits, magazine, patatos, pavilion});
        zlati.payStateTax();
        System.out.println(zlati.getCapital());


    }
}
