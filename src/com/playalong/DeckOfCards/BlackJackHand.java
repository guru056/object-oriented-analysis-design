package com.playalong.DeckOfCards;

import java.util.ArrayList;
import java.util.List;

public class BlackJackHand extends Hand<BlackJackCard> {
    final int BLACKJACK = 21;

    public BlackJackHand() {
        super();
    }

    @Override
    public int score() {
        List<Integer> possibleScores = getPossibleScores();
        int minOver = Integer.MAX_VALUE;
        int maxUnder = Integer.MIN_VALUE;
        for (int score: possibleScores) {
            if (score > BLACKJACK && score < minOver) {
                minOver = score;
            } else if(score <= BLACKJACK && score > maxUnder) {
                maxUnder = score;
            }
        }
        return maxUnder != Integer.MIN_VALUE ? maxUnder: minOver;
    }

    public boolean isBlackJack() {
        List<Integer> possibleScores = getPossibleScores();
        return possibleScores.contains(BLACKJACK);
    }

    public boolean isBusted() {
        List<Integer> possibleScores = getPossibleScores();
        for (int score: possibleScores) {
            if (score <= BLACKJACK)
                return false;
        }
        return true;
    }

    private List<Integer> getPossibleScores() {
        return getPossibleScoresRecursive(this.cards, 0, 0);
    }

    private List<Integer> getPossibleScoresRecursive(List<BlackJackCard> cards, int index, int sum) {
        List<Integer> resultList = new ArrayList<>();
        if (cards.size() == 0)
            return resultList;
        if (index == cards.size()-1) {
            resultList.add(sum + cards.get(index).value());
            if (cards.get(index).isAceCard()) {
                resultList.add(sum+ cards.get(index).maxValue());
            }
            return resultList;
        }
        BlackJackCard card = cards.get(index);
        resultList.addAll(getPossibleScoresRecursive(cards,index+1,sum+card.value()));
        if (card.isAceCard()) {
            resultList.addAll(getPossibleScoresRecursive(cards, index+1,sum+cards.get(index).maxValue()));
        }
        return resultList;
    }
}
