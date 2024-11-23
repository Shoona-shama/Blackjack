package domain;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class KartenStapel {
  private ArrayList<Karte> deck = new ArrayList<>();
  private int zahlUebrigerKarten;

  public KartenStapel(){

    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ass"};
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    int[] points = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

    for (String suit : suits) {
      for (int i = 0; i < ranks.length; i++) {
        deck.add(new Karte(ranks[i], suit, points[i]));
      }
    }
      Collections.shuffle(deck);

  }

  public int getZahlUebrigerKarten(){
    return zahlUebrigerKarten;
  }

    public Karte draw() {
        if (deck.isEmpty()) {
            throw new IllegalStateException("The deck is empty!");
        }
        return deck.remove(0); // Remove and return the first card in the list
    }




}
