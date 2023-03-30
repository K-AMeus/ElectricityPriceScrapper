package MeusKost;

public class PriceAnalyzer {
    final double priceNow;
    final double averageToday;


    public PriceAnalyzer(double priceNow, double averageToday) {
        this.priceNow = priceNow;
        this.averageToday = averageToday;
    }


    //Getter methods
    public double getPriceNow() {
        return priceNow;
    }

    public double getAverageToday() {
        return averageToday;
    }
}