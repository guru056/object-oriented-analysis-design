package com.playalong.DeckOfCards;

import java.util.Arrays;

public class BlackJackCard extends Card{

    public BlackJackCard(Enums.RANK rank, Enums.SUIT suit) {
        super(rank, suit);
    }

    @Override
    public int value() {
        int superVal = super.value();
        if (superVal >= 10)
            return 10;
        return superVal;
    }

    public int maxValue() {
        return this.isAceCard() ? 11: this.value();
    }

    public boolean isAceCard() {
        return this.rank == Enums.RANK.ACE;
    }

    public boolean isFaceCard() {
        return Arrays.asList(new Enums.RANK[]{Enums.RANK.ACE, Enums.RANK.JACK, Enums.RANK.QUEEN, Enums.RANK.KING}).contains(this.rank);
    }

}
