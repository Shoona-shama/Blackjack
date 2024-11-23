package domain;

public class Karte {

    private String karte;
     String farbe;
     int punkte;
     private int alternativePoints;

    Karte(String karte, String farbe,  int punkte){
    this.farbe = farbe;
    this.karte = karte;
    this.punkte = punkte;

        if (karte.equals("Ace")) {
            this.alternativePoints = 1;
        } else {
            this.alternativePoints = -1; // Indicates no alternative value.
        }

  }

    public String toString(){
        if (alternativePoints != -1) {
            return "this Karte is : (" + karte + " , color : " + farbe + " , points : " + punkte +
                    " , or " + alternativePoints + ")";
        }else {
            return " this Karte is : (" + karte + " , color : " + farbe + " , points : " + punkte + ")";
        }
  }

    public int getPunkte(){
       return punkte;
   }
    public int getAlternativePoints() {return alternativePoints;}
    public String getKarte() {return karte;}





}
