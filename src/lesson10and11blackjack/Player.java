package lesson10and11blackjack;

import java.util.Scanner;

public class Player {
    private String name;
    private Card[] hand = new Card[200];

    public Player(String name) {
        this.name = name;
    }

    public void addCardToHand(Card card) {
        for(int i = 0; i < hand.length; i++){
            if(hand[i] == null){
                hand[i] = card;
                break;
            }
        }
    }

    public boolean needsMoreCard() {
        System.out.println(" ------- ВАШИ КАРТЫ ------ " + name);
        printHand();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нужна ли вам еще одна карта? (да/нет)");
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("да")){
            return true;
        }

        return false;
    }

    public void printHand() {
        for(Card c: hand){
            if(c != null){
                c.open();
            }
        }
    }


}
