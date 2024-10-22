package lesson16StreamApi.Homework;
import java.util.*;
import java.util.stream.Collectors;

class Shop {
    private String name;
    private double income;
    private double area;

    public Shop(String name, double income, double area) {
        this.name = name;
        this.income = income;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public double getIncome() {
        return income;
    }

    public double getArea() {
        return area;
    }

    public double getIncomePerSquareMeter() {
        return area > 0 ? income / area : 0;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", income=" + income +
                ", area=" + area +
                '}';
    }
}