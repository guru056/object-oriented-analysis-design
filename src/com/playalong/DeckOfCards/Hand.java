package com.playalong.DeckOfCards;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand<T extends Card> {
    protected List<T> cards;

    public Hand() {
        this.cards = new ArrayList<T>();
    }

    public abstract int score() ;

    public void addCard(T card) {
        cards.add(card);
    }

}
