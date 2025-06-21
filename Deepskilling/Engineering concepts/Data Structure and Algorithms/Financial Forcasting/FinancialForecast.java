public class FinancialForecast {

    public static double forecastRecursive(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return (1 + growthRate) * forecastRecursive(presentValue, growthRate, years - 1);
    }

    public static double forecastMemoized(double presentValue, double growthRate, int years, Double[] memo) {
        if (years == 0) return presentValue;

        if (memo[years] != null) return memo[years];

        memo[years] = (1 + growthRate) * forecastMemoized(presentValue, growthRate, years - 1, memo);
        return memo[years];
    }

    public static void displayForecast(double presentValue, double growthRate, int years) {
        System.out.println("Yearly Forecast:");
        for (int i = 0; i <= years; i++) {
            double value = forecastRecursive(presentValue, growthRate, i);
            System.out.printf("Year %d: ₹%.2f\n", i, value);
        }
    }
}
