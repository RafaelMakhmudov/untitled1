package lesson10and11blackjack;

public class Main {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        BlackJack blackJack = new BlackJack(); // в момент создания объекта
        // должна создаваться внутри колода карт

        Player vasya = new Player("Василий");
        Player petya = new Player("Petr1");
        Player kolya = new Player("Николай");

        blackJack.addPlayerToGame(vasya);
        blackJack.addPlayerToGame(petya);
        blackJack.addPlayerToGame(kolya);
        blackJack.addPlayerToGame(dealer);

        blackJack.dealTwoCardsToAllPlayers(); // всем по 2 карты
        blackJack.dealRestCardsToAllPlayers();// раздаем оставшиеся карты


    }
}
