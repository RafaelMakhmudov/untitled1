package lesson8;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;
import java.util.Scanner;

public class ToursBaza {
    private Tour[] tours = new Tour[100000];

    public void addTour(Tour tour) {
        // null
        // Ищем первую пустую ячейку в массиве, чтоб положить тур
        for (int i = 0; i < tours.length; i++) {
            if (tours[i] == null) {  //  если в ячейке пусто
                tours[i] = tour; // сохранение тура
                break; // останавлиаемся, чтобы  копия тура не сохранялисьво все ячейки

            }
        }
    }

    // создать метод, который будет печатать на консоль туры в... страну
    public void searchByCountry() {
        System.out.println("Введите страну в которую хотите поехать: ");
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine().toLowerCase();
        System.out.println("-----------Туры в " + country);
        for (Tour t : tours) {
            if (t != null && t.getCountry().equalsIgnoreCase(country)) {
                t.printTour();
            }
        }
        System.out.println("---------------------------------------");


    }

    // метод для выбора тура по ценовому диапозону
    public void priceRange() {
        System.out.println("Введите минимальную стоимость тура: ");
        Scanner scanner = new Scanner(System.in);
        int price1 = scanner.nextInt();

        System.out.println("Введите максимальную стоимость тура: ");
        int price2 = scanner.nextInt();
        System.out.println("--------------------Туры от " + price1 + " до " + price2);
        for (Tour t : tours) {
            if (t != null && t.getPrice() >= price1 && t.getPrice() <= price2) {
                t.printTour();

            }

        }
        System.out.println("---------------------------------------------");


    }

    // метод выбора тура по виду транспорта
    public void modeOfTransport() {
        System.out.println("Выберите транспорт: ");
        Scanner scanner = new Scanner(System.in);
        String transport = scanner.nextLine().toLowerCase();
        System.out.println("------------------------Туры на " + transport);
        for (Tour t : tours) {
            if (t != null && t.getTransport().equalsIgnoreCase(transport)) {
                t.printTour();

            }
        }

        System.out.println("------------------------------------------------");
    }

    // метод выбора тура по количеству звезд от... и выше
    public void numberOfStars() {
        System.out.println("Введите минимальное количество звезд отеля : ");
        Scanner scanner = new Scanner(System.in);
        int minStars = scanner.nextInt();
        System.out.println("---------------------------Туры с отелями " + minStars + " звезд и выше!");
        for (Tour t : tours) {
            if (t != null && t.getHotel() != null && t.getHotel().getStars() >= minStars) {
                t.printTour();
            }

        }
    }    // метод с ценой тура менее введенной
    public void lowPrice() {
        System.out.println("Введите макссимальную стоимость тура: ");
        Scanner scanner = new Scanner(System.in);
        int priceMax = scanner.nextInt();
        System.out.println("---------------------------Туры до " + priceMax);
        for (Tour t : tours) {
            if (t != null && t.getPrice() <= priceMax) {
                t.printTour();

            }
        }

        System.out.println("---------------------------------------");

    }

   // метод для самого дорогого тура
    public void printMaxPriceTour() {
        Tour printMaxPriceTour = null;
        for (Tour t : tours) {
            if (t != null){
                if (printMaxPriceTour==null || t.getPrice() > printMaxPriceTour.getPrice()) {
                    printMaxPriceTour = t;
                }

            }
        }
        System.out.println("Самый дорогой тур: " );
        printMaxPriceTour.printTour();


    }

    }





