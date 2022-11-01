package labs_examples.objects_classes_methods.labs.oop.C_blackjack.execution;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args){
        System.out.println("Welcome" + "Please select one of the following");

        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();
        playingDeck.shuffle();
        Deck playerDeck = new Deck();
        Deck dealerDeck = new Deck();
        double playerMoney = 100.00;

        Scanner userInput = new Scanner(System.in);
        while(playerMoney > 0){
            System.out.println("you have $" + playerMoney + ", what amount would you like to bet?");
            double playerBet = userInput.nextDouble();
            if(playerBet > playerMoney){
                System.out.println("Sir/Madam, you've had too much to drink, please leave now.");
                break;
            }

            playerDeck.draw(playingDeck);
            playerDeck.draw(playingDeck);

            dealerDeck.draw(playingDeck);
            dealerDeck.draw(playingDeck);

            while(true){
                System.out.println("Your hand:");
                System.out.println(playerDeck.toString());
            }

        }

        System.out.println("Please leave the table, come back with more money!");

    }
    
}
