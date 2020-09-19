package com.skilldistillery.commom.cards;


public class Dealer {
	private Deck dealerDeck = new Deck();
	private Hand dealerHand = new BlackjackHand();

	public Hand getDealerHand() {
		return dealerHand;
	}

	public void addCardToHand() {
		dealerHand.addCard(dealCardFromDeck());
	}

	public Card dealCardFromDeck() {
		return dealerDeck.dealCard();
	}

	@Override
	public String toString() {
		return " " + dealerHand + " ";
	}
	public String toStringHidden() {
		return " " + dealerHand.toStringHidden() + " ";
	}
	
	public Dealer() {
	dealerDeck.shuffleDeck();
	}
}
