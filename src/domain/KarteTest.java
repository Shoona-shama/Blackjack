package domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarteTest {

    @Test
    void getPunkte() {
        Karte karte = new Karte("10", "Diamonds", 10) ;
        int result = karte.getPunkte();
        assertEquals(10, result);
    }
    @Test
    void getNotValid1Punkte() {
        Karte karte = new Karte("King", "Diamonds", 9) ;
        int result = karte.getPunkte();
        assertEquals(10, result);
    }
    @Test
    void getNotValid2Punkte() {
        Karte karte = new Karte("King", "Diamonds", 10) ;
        int result = karte.getPunkte();
        assertEquals(9, result);
    }

    @Disabled
    void getAlternativePoints() {
    }

    @Test
    void getKarte() {
        Karte karte = new Karte("10", "Clubs", 10);
        String result = karte.getKarte();
        assertEquals("10", result);
    }
    @Test
    void getKarteNotValid() {
        Karte karte = new Karte("10", "Clubs", 10);
        String result = karte.getKarte();
        assertEquals("ASS", result);
    }
    @Test
    void getKarteNotValid2() {
        Karte karte = new Karte("9", "Clubs", 10);
        String result = karte.getKarte();
        assertEquals("10", result);
    }


}