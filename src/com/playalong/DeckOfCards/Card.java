package com.playalong.DeckOfCards;

import com.playalong.DeckOfCards.Enums.*;

public abstract class Card {

    protected RANK rank;
    protected SUIT suit;
    private boolean isAvailable;

    public Card(RANK rank, SUIT suit) {
        this.rank = rank;
        this.suit = suit;
        isAvailable = true;
    }

    public int value() {
        return this.rank.ordinal() + 1;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
