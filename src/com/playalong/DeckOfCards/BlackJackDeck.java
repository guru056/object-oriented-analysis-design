package com.playalong.DeckOfCards;

public class BlackJackDeck extends Deck {

    public BlackJackDeck(int numOfCards) {
        super(numOfCards);
        for (Enums.SUIT suit: Enums.SUIT.values()) {
            for (Enums.RANK rank: Enums.RANK.values()) {
                cards.add(new BlackJackCard(rank,suit));
            }
        }
    }

    public BlackJackDeck() {
        super();
    }

}
