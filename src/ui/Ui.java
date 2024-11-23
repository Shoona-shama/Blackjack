package ui;

import facade.BlackJackSpiel;

import java.util.Scanner;

public class Ui {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BlackJackSpiel spiel = new BlackJackSpiel();

        System.out.println("Hello!");
        System.out.println("Welcome to Game Blackjack, At the start of the Game you will receive 2 Cards:");
        System.out.println(spiel.getNeueHand());
        System.out.println("Your current Punktzahl is: " + spiel.aktuellePunktZahl());

        // Main game loop
        while (true) {
            // Check if the player has lost (Punktzahl > 21)
            if (spiel.aktuellePunktZahl() > 21) {
                System.out.println("You have lost! Your Punktzahl exceeded 21.");
                break; // End the game immediately
            }

            // Check if the player has won (Blackjack with 21 points)
            if (spiel.isBlackJack()) {
                System.out.println("Congratulations! You have won! Your Punktzahl is 21.");
                break; // End the game immediately
            }

            // Ask the player if they want to draw another card
            System.out.println("Do you wish to draw another card? (yes/no)");
            String spielerAntwort = sc.nextLine().trim();

            // Validate input
            while (!spielerAntwort.equalsIgnoreCase("yes") && !spielerAntwort.equalsIgnoreCase("no")) {
                System.out.println("Please answer with 'yes' or 'no'.");
                spielerAntwort = sc.nextLine().trim();
            }

            if (spielerAntwort.equalsIgnoreCase("no")) {
                // Player ends the game without drawing
                System.out.println("Since your answer is 'no' and your Punktzahl is: " + spiel.aktuellePunktZahl() +
                        ", the game has ended. Goodbye!");
                break;
            } else if (spielerAntwort.equalsIgnoreCase("yes")) {
                // Player chooses to draw a new card
                System.out.println("Your new card is:");
                spiel.drawANewCardFromDeck();
                System.out.println(spiel.currentHands());
                System.out.println("Your current Punktzahl is: " + spiel.aktuellePunktZahl());
            }
        }

        sc.close(); // Close the scanner
    }



}
