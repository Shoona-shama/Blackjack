package facade;

import domain.Hand;
import domain.Karte;
import domain.KartenStapel;

public class BlackJackSpiel {
     Hand hand;
     Karte karte;
     KartenStapel ks ;

    public BlackJackSpiel(){
        ks = new KartenStapel();
    }

    public boolean isANewGame(){
        return hand == null;     //directly returns true/false
    }

    public Hand getNeueHand(){
        if (isANewGame()) {
            hand = new Hand(ks); // Create a new Hand if it's a new game
            hand.drawCard(); // Draw two cards for the new game
            hand.drawCard();
        }
        return hand;
    }
    public int aktuellePunktZahl(){
        if (hand == null) {
            return 0;
        }
      return  hand.getPunkte();
    }

    public void drawANewCardFromDeck(){
         hand.drawCard();
    }
    public boolean isBlackJack(){
        if (hand.isBlackJack()){
            return true;
        }else if (hand.getPunkte() > 21){
            return false;
        }else {
            return false;
        }

    }
    public Hand currentHands(){
        return hand;
    }





}
