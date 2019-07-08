import java.util.Scanner;

public class WeddingDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();
        int baloonCount = 0;
        int flowersCount = 0;
        int candlesCount = 0;
        int ribbonCount = 0;
        double price = 0;
        while (!input.equals("stop")) {
            String product = input;
            int counts = Integer.parseInt(scanner.nextLine());
            if ("balloons".equals(product)) {
                baloonCount += counts;
                double priceA = counts * 0.1;
                price += priceA;
                budget -= priceA;
            } else if ("flowers".equals(product)) {
                flowersCount += counts;
                double priceB = counts * 1.50;
                price += priceB;
                budget -= priceB;
            } else if ("candles".equals(product)) {
                candlesCount += counts;
                double priceC = counts * 0.50;
                price += priceC;
                budget -= priceC;
            } else if ("ribbon".equals(product)) {
                ribbonCount += counts;
                double priceD = counts * 2;
                price += priceD;
                budget -= priceD;
            }

            if (budget <= 0) {
                System.out.printf("All money is spent!%nPurchased decoration is %d balloons, %d m ribbon, %d flowers and %d candles.", baloonCount, ribbonCount, flowersCount, candlesCount);
                break;
            }

            input = scanner.nextLine();

            if (input.equals("stop")) {
                System.out.printf("Spend money: %.2f%n", price);
                System.out.printf("Money left: %.2f%n", budget);
                System.out.printf("Purchased decoration is %d balloons, %d m ribbon, %d flowers and %d candles.", baloonCount, ribbonCount, flowersCount, candlesCount);
            }
        }

    }
}
