package com.skilldistillery.commom.cards;

public enum Suit {
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");

	Suit(String s) {
		name = s;
	}

	private String name;

	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

}
