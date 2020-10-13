package com.playalong.DeckOfCards;

public abstract class AbstractPlayer {
    protected BlackJackHand hand;

    public AbstractPlayer() {
        hand = new BlackJackHand();
    }

    public abstract void performAction(BlackJackCard card);
    public void drawCard(BlackJackCard card) {
        hand.addCard(card);
    }
}
