package MeusKost;


public class Main {

    public static void main(String[] args) {

        UserInput input = new UserInput();
        Scraper scraper = new Scraper();

        input.ask("Mis hinnast alates sa elektrit osta tahad? (senti/kWh)");

        scraper.scrape(input.retrieve());


    }
}
