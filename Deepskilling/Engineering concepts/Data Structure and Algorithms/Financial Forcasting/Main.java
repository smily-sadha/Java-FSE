public class Main {
    public static void main(String[] args) {
        double presentValue = 10000;
        double annualGrowthRate = 0.08;
        int years = 5;

        FinancialForecast.displayForecast(presentValue, annualGrowthRate, years);

        Double[] memo = new Double[years + 1];
        double finalValue = FinancialForecast.forecastMemoized(presentValue, annualGrowthRate, years, memo);
        System.out.printf("\nOptimized Final Value after %d years: ₹%.2f\n", years, finalValue);
    }
}
