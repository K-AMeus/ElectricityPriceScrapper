package MeusKost;


public class Main {

    public static void main(String[] args) {

        UserInput input = new UserInput();
        Scraper scraper = new Scraper();
        FavNumber number = new FavNumber();

        input.ask("Mis hinnast alates sa elektrit osta tahad? (senti/kWh)");

        scraper.scrape(input.retrieve());

        number.tagasta();





    }
}
