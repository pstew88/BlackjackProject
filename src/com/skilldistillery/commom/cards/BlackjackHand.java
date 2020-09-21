package com.skilldistillery.commom.cards;

public class BlackjackHand extends Hand {

	private int handValue;
	
	public BlackjackHand() {
	}


	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	public String toStringHidden() {
		return super.toStringHidden();
	}
	
	@Override
	public int getHandValue() {
		handValue = 0;
		for (int i = 0; i < hand.size(); i++) {
			handValue = hand.get(i).getValue() + handValue;
			if (hand.get(i).getValue()==11 && handValue > 21) {
				handValue = handValue-10;
			}
		}
		return handValue; 
	}
	

	
	public int getSoftAceValue() {
		handValue = 0;
		for (int i = 0; i < hand.size(); i++) {
			handValue = hand.get(i).getValue() + handValue;
		}
		return handValue-10;
	}


	@Override
	public int setHandValue() {
		// TODO Auto-generated method stub
		return 0;
	}
}
