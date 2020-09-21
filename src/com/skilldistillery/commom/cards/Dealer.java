package com.skilldistillery.commom.cards;


public class Dealer {
	private Deck dealerDeck = new Deck();
	private BlackjackHand dealerHand = new BlackjackHand();

	public BlackjackHand getDealerHand() {
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
	
	public boolean hasAce() {
		return dealerHand.isAce();
	}
	
	public Dealer() {
	dealerDeck.shuffleDeck();
	}
}
