package labs_examples.objects_classes_methods.labs.oop.C_blackjack.execution;


public class Card {

    private Suit suit;
    public Value value;

    public Card(Suit suit, Value value){
        this.value = value;
        this.suit = suit;
    }

    public String toString(){
        return this.suit.toString() + "-" + this.value.toString();
    }

    public Value getValue(){
        return this.value;
    }

//    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
//    int cardValue;

}
