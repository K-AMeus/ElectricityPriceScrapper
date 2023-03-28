package MeusKost;

public class PriceAnalyzer {
    final int priceNow;
    final int averageToday;
    final int minToday;
    final int maxToday;
    final int averageYesterday;

    public PriceAnalyzer(int priceNow, int averageToday, int minToday, int maxToday, int averageYesterday) {
        this.priceNow = priceNow;
        this.averageToday = averageToday;
        this.minToday = minToday;
        this.maxToday = maxToday;
        this.averageYesterday = averageYesterday;
    }


    //Getter methods
    public int getPriceNow() {
        return priceNow;
    }

    public int getAverageToday() {
        return averageToday;
    }

    public int getMinToday() {
        return minToday;
    }

    public int getMaxToday() {
        return maxToday;
    }

    public int getAverageYesterday() {
        return averageYesterday;
    }
}
