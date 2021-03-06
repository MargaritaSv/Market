package MarketTask;

import MarketTask.DealersObjects.Ambulatory;
import MarketTask.DealersObjects.ET;
import MarketTask.DealersObjects.MarketingChaining;
import MarketTask.Markets.Magazine;
import MarketTask.Markets.Market;
import MarketTask.Markets.Pavilion;
import MarketTask.Markets.PavilionStreet;

import java.util.*;

public class Main {
    private static final int MIN_PRICE_OF_PRODUCTS = 1;
    private static final int MAX_PRICE_OF_PRODUCTS = 15;
    private static final int MIN_NUMBER_OF_PRODUCTS = 1;
    private static final int MAX_NUMBER_OF_PRODUCTS = 15;

    public static void main(String[] args) {

//1
        final String[] names = {"Stefan", "Katq", "Elena", "Georgy", "Magy"};
        final String[] cities = {"Burgas", "Sofiq", "Plovdiv", "Ryse", "Kalofer"};

        Provider[] providers = new Provider[10];
        Provider provider;
        for (int i = 0; i < providers.length; i++) {
            provider = new Provider(names[new Random().nextInt(names.length - 1)],
                    cities[new Random().nextInt(cities.length - 1)],
                    new Random().nextInt(23) + 1,
                    new Random().nextBoolean() ? TypeProviders.PROVIDERTORETAIL : TypeProviders.WHOLESALESUPPLIER);
            providers[i] = provider;
        }

        //every provider gets some products
        LinkedHashMap<String, Integer> someProducts;
        for (int i = 0; i < providers.length; i++) {
            someProducts = makeProducts();
            providers[i].setProducts(someProducts);
        }

        //2
        Market[] markets = new Market[20];
        Market market;
        for (int i = 0; i < 20; i++) {
            if (Math.random() > 0.66) {
                market = new Magazine("Market", cities[new Random().nextInt(cities.length - 1)], new Random().nextInt(10) + 100);
            } else if (Math.random() > 0.33) {
                market = new Pavilion("Сергия", cities[new Random().nextInt(cities.length - 1)], new Random().nextInt(2) + 10);
            } else {
                market = new PavilionStreet("Bydka", cities[new Random().nextInt(cities.length - 1)], new Random().nextInt(4) + 6);
            }
            markets[i] = market;
        }

        //3
        Ambulatory zlati = new Ambulatory("Zlati", "Lovech", 100.0);
        ET magi = new ET("Daisy", "Sofiq ", 700.00);
        Dealer georgi = new MarketingChaining("Georgy", "Pozitano 25", 3000.0);

//4

        //create dealers with market/s
        while (true) {
            Provider rndProvider = providers[new Random().nextInt(providers.length - 1)];
            if (rndProvider.getTypeProviders().equals(TypeProviders.PROVIDERTORETAIL)) {
                zlati.setProvider(rndProvider);
                break;
            }
        }

        Market[] marketsForZlati = new Market[markets.length / 2];
        for (int i = 0; i < marketsForZlati.length; i++) {
            marketsForZlati[i] = markets[i];
        }

        zlati.setMarkets(marketsForZlati);
        System.out.println(zlati.toString());
    }

    public static LinkedHashMap<String, Integer> makeProducts() {
        String[] products = new String[]{"Apricots ", "Asparagus ", "apple", "grapes",
                "bananas", "aubergines", "avocado", "Beetroot ", "bean", "broccoli", "Butternut squash", "Brussels sprouts"};
        LinkedHashMap<String, Integer> productPrice = new LinkedHashMap<>();


        for (int i = 0; i < products.length; i++) {
            int rnd = MIN_PRICE_OF_PRODUCTS + (int) (Math.random() * MAX_PRICE_OF_PRODUCTS);
            productPrice.put(products[i], rnd);
        }

        return productPrice;
    }

    public static void oborot(Dealer dealer, Provider provider) {
        int sum = 0;
        int rnd = MIN_NUMBER_OF_PRODUCTS + (int) (Math.random() * MAX_NUMBER_OF_PRODUCTS);

        for (int i = 0; i < rnd; i++) {
//TODO: take products
        }

        if (provider.getTypeProviders().equals(TypeProviders.PROVIDERTORETAIL)) {
            int afterDiscount = sum - (int) (sum * 0.15);
            sum = afterDiscount;
        }

        double halfCapacity = dealer.getCapital() * 0.50;
        if ((double) sum > halfCapacity) {
            System.out.println("The money for this products is not enough.");
        } else {
            dealer.setCapital(dealer.getCapital() - sum);
        }
    }

}