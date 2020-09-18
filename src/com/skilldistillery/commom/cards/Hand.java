package com.skilldistillery.commom.cards;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> hand;

	public Hand() {
	}

	public void addCard(Card card) {
				hand.add(card); //add dealer
			}
		

	public void getHandValue() {
		int result = 0;
		for (int i = 0; i < hand.size(); i++) {
			result = hand.get(i).getValue() + result;
		}
	}

	public void clearHand() {
		hand = new ArrayList<Card>();
	}

	@Override
	public String toString() {
		return "Your hand is " + hand + ".";
	}

}
