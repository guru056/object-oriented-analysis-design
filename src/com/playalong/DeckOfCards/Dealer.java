package com.playalong.DeckOfCards;

public class Dealer extends AbstractPlayer {
    final int MAX_ALLOWED_SCORE = 17;

    @Override
    public void performAction(BlackJackCard card) {
        int score = hand.score();
        do {
            hand.addCard(card);
            score += hand.score();
        } while (score <= MAX_ALLOWED_SCORE);
    }
}
