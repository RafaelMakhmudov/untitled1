package lesson10and11blackjack;

public class Card {
    // валет трефа
    // 10
    private String mast;
    private int ball;

    public Card(String mast, int ball) {
        this.mast = mast;
        this.ball = ball;
    }

    public void open(){
        System.out.println(mast);
    }
}
