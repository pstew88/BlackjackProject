package com.skilldistillery.commom.cards;

public class BlackjackHand extends Hand {

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
		int result = 0;
		for (int i = 0; i < hand.size(); i++) {
			result = hand.get(i).getValue() + result;
		}
		return result; 
	}
}
