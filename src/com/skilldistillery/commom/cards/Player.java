package com.skilldistillery.commom.cards;

public class Player {
	private BlackjackHand playerHand = new BlackjackHand();

	public BlackjackHand getPlayerHand() {
		return playerHand;
	}

	public void addCardToHand(Card a) {
		playerHand.addCard(a);
	}

	@Override
	public String toString() {
		return " " + playerHand + " ";
	}

}
