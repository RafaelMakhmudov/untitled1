package lesson10and11blackjack;

public class BlackJack {
    private Koloda koloda = new Koloda();
    private Player[] players = new Player[9];


    public BlackJack(){
        koloda.createKoloda();
    }

    public void addPlayerToGame(Player player) {
        for(int i = 0; i < players.length; i++){
            if(players[i] == null){
                players[i] = player;
                break;
            }
        }
    }

    public void dealTwoCardsToAllPlayers() {
        for(Player p: players){
            if(p != null){
                p.addCardToHand(koloda.rundomCard());
                p.addCardToHand(koloda.rundomCard());
            }
        }
    }

    public void dealRestCardsToAllPlayers() {
        for(Player p: players){
            if(p != null){
                // узнаем нужна ли карта, и если нужна - даем ее
                // и так по кругу, пока не скажет НЕТ
                while (p.needsMoreCard()){ // метод должен вернуть true или false
                    p.addCardToHand(koloda.rundomCard());
                }
            }
        }
    }
}
