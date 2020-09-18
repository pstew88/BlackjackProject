package com.skilldistillery.commom.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;

	
	public Deck() {
		cards = new ArrayList<>(52);
		for (Suit suit: Suit.values()) {
			for (Rank rank : Rank.values()) {
				cards.add(new Card(suit, rank));			
			}
		}
	}

	public void shuffleDeck() {

		Collections.shuffle(cards);
		
	}

	public int checkDeckSize() {
		return cards.size();
	}

	public Card dealCard() {
		return cards.remove(0);
	}
}
