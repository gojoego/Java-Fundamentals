package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

// (POJO - this will hold deck data)

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.Attr;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    Card[] cards;
    ArrayList<Integer> usedCards;

    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                ", usedCards=" + usedCards +
                '}';
    }
/*
    1) In the Deck.java class, create a method that will populate the Card[] with 52 unique Card object. The cards
    should mimic an actual card deck. It should contain four aces (spades, hearts, diamonds, clubs), four 2's
            (spades, hearts, diamonds, clubs), four 3's (spades, hearts, diamonds, clubs), ... up through Jacks, Queens and Kings
    */

    // method that will populate Card[] with 52 unique card objects
    // 4 of aces, 4 2's, 4 3's... 4 Jacks, 4 Queens, and 4 Kings
    // use for loop or for each loop to populate array
    // initial count = 0
    // ArrayList arrayListName = new ArrayList;
    public static void populateDeck(){

        ArrayList cards = new ArrayList();
        int[] cardNames  = { 'A', 2, 3, 4, 5, 6, 7, 8, 9, 10, 'J', 'Q', 'K'};

        char[] suit = new char[]{'♠', '♦', '♥', '♣'};

        // need ArrayList that is 52 x 4
        for (int x = 0; x <= 12; x++){
            for (int y = 0; y <= 0; y++){
                cards.add(suit[x],cardNames[y]);

                System.out.println(cards);
            }
        }
    }

    public static void main(String[] args) {
        populateDeck();
    }
}


