package lesson8;

public class Main {
    public static void main(String[] args) {

        Hotel hotelItaliy1 = new Hotel("Венеция отель", "завтраки", 4);
        Hotel hotelItaliy2 = new Hotel("Рим отель", "пансион", 3);
        Hotel hotelItaliy3 = new Hotel("Портофино отель", "завтраки", 4);
        Hotel hotelFrance1 = new Hotel("Анси отель", "пансион", 5);
        Hotel hotelFrance2 = new Hotel("Париж отель", "полупансион", 4);
        Hotel hotelFrance3 = new Hotel("Лион отель", "завтраки", 5);
        Hotel hotelOAE1 = new Hotel("Дубай отель", "пансион", 3);
        Hotel hotelOAE2 = new Hotel("Абу Даби отель", "завтраки", 4);
        Hotel hotelOAE3 = new Hotel("Аджман отель", "полупансеон", 4);
        Hotel hotelFinlyandia = new Hotel("Хельсинки отель", "завтраки", 4);

        Tour france1 = new Tour("Франция",6,"Самолет",1500000,hotelFrance1);
        Tour france2 = new Tour("Франция",4,"Самолет",120000,hotelFrance2);
        Tour france3 = new Tour("Франция",10,"автобус",90000,hotelFrance3);
        Tour italy1 = new Tour("Италия",4,"Самолет",45000,hotelItaliy1);
        Tour italy2 = new Tour("Италия",12,"Паром",150000,hotelItaliy2);
        Tour italy3 = new Tour("Италия",6,"Самолет",700000,hotelItaliy3);
        Tour oae1 = new Tour("ОАЕ",11,"Самолет",350000,hotelOAE1);
        Tour oae2 = new Tour("ОАЕ",15,"Самолет",550000,hotelOAE2);
        Tour oae3 = new Tour("ОАЕ",7,"Самолет",100000,hotelOAE3);
        Tour finlyandia = new Tour("Финляндия",4,"Автобус",60000,hotelFinlyandia);

        ToursBaza baza = new ToursBaza();
        baza.addTour(france1);
        baza.addTour(france2);
        baza.addTour(france3);
        baza.addTour(italy1);
        baza.addTour(italy2);
        baza.addTour(italy3);
        baza.addTour(oae1);
        baza.addTour(oae2);
        baza.addTour(oae3);
        baza.addTour(finlyandia);

        baza.searchByCountry();

        baza.priceRange();

        baza.modeOfTransport();

        baza.numberOfStars();

        baza.lowPrice();

        baza.printMaxPriceTour();



    }



}