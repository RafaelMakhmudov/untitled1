package lesson16StreamApi.Homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShopNetwork {
    public static void main(String[] args) {
        List<Shop> shops = Arrays.asList(
                new Shop("Shop A", 120000, 150),
                new Shop("Shop B", 50000, 80),
                new Shop("Shop C", 300000, 250),
                new Shop("Shop D", 90000, 70),
                new Shop("Shop E", 200000, 200),
                new Shop("Shop F", 150000, 100)
        );

        // 1. Общий доход по всем магазинам сети
        double totalIncome = shops.stream().mapToDouble(Shop::getIncome).sum();
        System.out.println("Общий доход: " + totalIncome);

        // 2. Количество магазинов в сети
        long shopCount = shops.size();
        System.out.println("Количество магазинов: " + shopCount);

        // 3. Средний доход на каждый магазин
        double averageIncome = shops.stream().mapToDouble(Shop::getIncome).average().orElse(0);
        System.out.println("Средний доход на магазин: " + averageIncome);

        // 4. Сортируем магазины по доходности от большего к меньшему
        List<Shop> sortedByIncome = shops.stream()
                .sorted(Comparator.comparingDouble(Shop::getIncome).reversed())
                .collect(Collectors.toList());
        System.out.println("Сортировка магазинов по доходности:");
        sortedByIncome.forEach(System.out::println);

        // 5. Сортируем магазины по соотношению дохода на 1м площади магазина
        List<Shop> sortedByIncomePerSquareMeter = shops.stream()
                .sorted(Comparator.comparingDouble(Shop::getIncomePerSquareMeter).reversed())
                .collect(Collectors.toList());
        System.out.println("Сортировка магазинов по доходу на 1м²:");
        sortedByIncomePerSquareMeter.forEach(System.out::println);

        // 6. Топ 2 лучших и худших магазина по доходу
        System.out.println("Топ 2 лучших магазина по доходу:");
        sortedByIncome.stream().limit(2).forEach(System.out::println);

        System.out.println("Топ 2 худших магазина по доходу:");
        sortedByIncome.stream().skip(sortedByIncome.size() - 2).forEach(System.out::println);

        // 7. Магазины, где доход на 1м² больше 1000 рублей
        System.out.println("Магазины с соотношением дохода на 1м² больше 1000 рублей:");
        shops.stream()
                .filter(shop -> shop.getIncomePerSquareMeter() > 1000)
                .forEach(System.out::println);
    }
}