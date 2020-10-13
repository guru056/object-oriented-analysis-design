package com.playalong.DeckOfCards;

import com.playalong.DeckOfCards.Enums.*;

import java.util.Collections;
import java.util.List;

public abstract class Deck {
    protected final int DEFAULT_NUM_CARDS_IN_DECK = 52;
    protected int numOfCards = DEFAULT_NUM_CARDS_IN_DECK;

    protected List<Card> cards;
    protected int dealIndex;

    public Deck(int numOfCards) {
        this.numOfCards = numOfCards;
        dealIndex = 0;
    }

    public Deck() {
        this.numOfCards = DEFAULT_NUM_CARDS_IN_DECK;
        dealIndex = 0;
    }

    public Card deal() {
        try {
            Card card = this.cards.get(dealIndex);
            card.setAvailable(false);
            dealIndex++;
            return card;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No cards available in deck");
            return null;
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public int remainingCards() {
        return cards.size() - dealIndex;
    }
}
