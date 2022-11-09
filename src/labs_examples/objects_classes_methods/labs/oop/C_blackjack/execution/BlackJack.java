package labs_examples.objects_classes_methods.labs.oop.C_blackjack.execution;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args){
        System.out.println("Welcome, how much money are we wasting today?");
        Scanner userInput = new Scanner(System.in);

        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();
        playingDeck.shuffle();
        Deck playerDeck = new Deck();
        Deck dealerDeck = new Deck();
        double playerMoney = userInput.nextDouble();;

        while(playerMoney > 0){
            System.out.println("you have $" + playerMoney + ", what amount would you like to bet?");
            double playerBet = userInput.nextDouble();
            if(playerBet > playerMoney){
                System.out.println("Sir/Madam, you've had too much to drink, please leave now.");
                break;
            }

            boolean endRound = false;

            playerDeck.draw(playingDeck);
            playerDeck.draw(playingDeck);

            dealerDeck.draw(playingDeck);
            dealerDeck.draw(playingDeck);

            while(true){
                System.out.println("Your hand:");
                System.out.println(playerDeck.toString());
                System.out.println("your deck value is at: " + playerDeck.cardsValue());

                System.out.println("dealer's hand:" + dealerDeck.getCard(0).toString() + " He's also got a hidden card");
                System.out.println("Hit(1) Stand(2)");
                int response = userInput.nextInt();

                if (response == 1 ){
                    playerDeck.draw(playingDeck);
                    System.out.println("You draw a: " + playerDeck.getCard(playerDeck.deckSize()-1).toString());
                    if(playerDeck.cardsValue() > 21){
                        System.out.println("Bust: Current value: " + playerDeck.cardsValue());
                        playerMoney -= playerBet;
                        endRound = true;
                        break;

                    }
                }

                if(response ==2){
                    break;
                }
            }

            System.out.println("Dealer's cards: " + dealerDeck.toString());
            if ((dealerDeck.cardsValue() > playerDeck.cardsValue()&& !endRound)){
                System.out.println("Dealer wins!");
                playerMoney -= playerBet;
                endRound = true;
            }

            while((dealerDeck.cardsValue() < 17) && !endRound){
                dealerDeck.draw(playingDeck);
                System.out.println("Dealer draws a: " + dealerDeck.getCard(dealerDeck.deckSize()-1).toString());
            }

            System.out.println("Dealer's hand value: " + dealerDeck.cardsValue());
            if((dealerDeck.cardsValue() > 21)&& !endRound){
                System.out.println("Player Wins!");
                playerMoney += playerBet;
                endRound = true;
            }

            if((playerDeck.cardsValue() == dealerDeck.cardsValue())&& !endRound){
                System.out.println("Push");
                endRound = true;
            }

            if ((playerDeck.cardsValue() > dealerDeck.cardsValue()) && !endRound){
                System.out.println("You win!");
                playerMoney += playerBet;
                endRound = true;
            }

            else if(!endRound){
                playerMoney -= playerBet;
                System.out.println("You lose the hand");
                endRound = true;
            }

            playerDeck.moveAllToDeck(playingDeck);
            dealerDeck.moveAllToDeck(playingDeck);
            System.out.println("End of hand");
        }

        System.out.println("Please leave the table, come back with more money!");

    }
    
}
