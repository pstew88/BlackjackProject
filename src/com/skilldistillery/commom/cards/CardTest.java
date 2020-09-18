package com.skilldistillery.commom.cards;

import java.util.Scanner;

public class CardTest {
	public static void main(String[] args) {
//    Rank[] ranks = Rank.values();
//    for(int i=0; i<ranks.length; i++) {
//      System.out.println(ranks[i] + " " + ranks[i].getValue());
//    }
//    
//    for(Suit s : Suit.values()){
//      System.out.println(s);
//    }
		Deck deck = new Deck();
		deck.shuffleDeck();

		Scanner kb = new Scanner(System.in);
		System.out.println("How many cards");

		try {
			int num = kb.nextInt();

			if (num > 52) {
				System.out.println("too many cards");
			} else {
				int value = 0;
				for (int i = 0; i < num; i++) {
					Card c = deck.dealCard();
					value+= c.getValue();
					System.out.println(c);
				}
				System.out.println("your value is "+value);
			}
		} catch (Exception e) {
			System.out.println("Please enter a number");
		}
	}
}
