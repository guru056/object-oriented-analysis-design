package com.playalong.DeckOfCards;

import java.util.Scanner;

public class Player extends AbstractPlayer {

    @Override
    public void performAction(BlackJackCard card) {
        Enums.State state;
        Scanner sc = new Scanner(System.in);

        do {
            state = getState(sc.nextLine());
            switch (state) {
                case HIT:
                    drawCard(card);
                    break;
                case STAND:
                    break;
            }
            if ( hand.isBlackJack() ) {
                System.out.println("Winner");
                break;
            }
            if (hand.isBusted()) {
                System.out.println("Wait for the dealer");
                break;
            }
        } while (state != Enums.State.HIT);
    }

    private Enums.State getState(String state){
        switch (state) {
            case "HIT":
                return Enums.State.HIT;
            case "STAND":
                return Enums.State.STAND;
            default:
                return Enums.State.STAND;
        }
    }
}
