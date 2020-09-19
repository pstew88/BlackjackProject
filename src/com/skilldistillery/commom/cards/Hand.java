package com.skilldistillery.commom.cards;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> hand;

	public Hand() {

		hand = new ArrayList<Card>();
	}

	public void addCard(Card card) {
		hand.add(card); // add dealer
	}

	public abstract int getHandValue();

	public void clearHand() {
		hand = new ArrayList<Card>();
	}
	public String toStringHidden() {
		String printHand = "Hand: ";
		Card card = hand.get(0);	
		printHand += card;
		return printHand;
		}

	@Override
	public String toString() {
		String printHand = "Hand: ";
		for (int i = 0; i < hand.size(); i++) {
			Card card = hand.get(i);
			printHand += card;
			if (i != hand.size() - 1) {
				printHand += ", ";
			}
		}
		return printHand;
	}

}
