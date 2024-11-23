package domain;

import java.util.ArrayList;
import java.util.List;


public class Hand {

   //public Karte karte;
    KartenStapel ks;
    private List<Karte> cardsInHand;

    public Hand(KartenStapel ks){
        this.ks = ks;
        this.cardsInHand = new ArrayList<>();
    }
 //   public Hand() {
  //      this.cardsInHand = new ArrayList<>();
 //   }

    public String toString(){
        return "You have currently : \n" + cardsInHand +  " cards at your disposal" ;
    }

    public int getPunkte(){
        int aceCount = 0;
        int currentPunkte = 0;

        for (Karte karte : cardsInHand) {
            currentPunkte += karte.getPunkte();
            if (karte.getKarte().equals("Ace")) {
                aceCount++;
            }
        }
        while (currentPunkte > 21 && aceCount > 0) {
            currentPunkte -= 10; // Convert one Ace from 11 to 1
            aceCount--;
        }

        return currentPunkte;
    }

    public void drawCard() {
        if (ks == null) {
            throw new IllegalStateException("KartenStapel is not initialized.");
        }
        Karte drawnCard = ks.draw(); // Draw a card from the deck
        cardsInHand.add(drawnCard); // Add it to the hand
        System.out.println( drawnCard);
    }

    public boolean isBlackJack() {
        return getPunkte() == 21;
    }

}
