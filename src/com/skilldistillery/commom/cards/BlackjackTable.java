package com.skilldistillery.commom.cards;

import java.util.Scanner;

public class BlackjackTable {
	Player player = new Player();
	Dealer dealer = new Dealer();
	Scanner kb = new Scanner(System.in);
	Deck gameDeck = new Deck();
	boolean playerUseSoftAce = false;
	boolean dealerUseSoftAce = false;

	public static void main(String[] args) {
		BlackjackTable b = new BlackjackTable();
		b.run();
	}

	private void run() {
		dealStart();
		playerMenu();
	}

	private void playerMenu() {
		if (player.getPlayerHand().getHandValue() == 21) {
			System.out.println("You have hit 21, it is now the dealers turn");
			System.out.println("");
			dealerRun();
		}

		else {
			System.out.println("");
			System.out.println("Would you like to hit or stay?");
			System.out.println("");
			System.out.println("1: Hit");
			System.out.println("2: Stay");
			String choice = kb.next().toLowerCase();

			if (choice.contentEquals("1") || choice.contentEquals("one") || choice.contentEquals("hit")) {
				player.addCardToHand(dealer.dealCardFromDeck());
				System.out.println("Player's Hand: ");
				System.out.println(player.toString());

				if (player.getPlayerHand().getHandValue() <= 21) {
					playerMenu();

				} else if (player.getPlayerHand().getHandValue() >= 21) {
					if (player.hasAce()) {
						player.getPlayerHand().getHandValue();
						playerUseSoftAce = true;
						playerMenu();
					} else {
						System.out.println("BUST! " + player.getPlayerHand().getHandValue() + " : Game Over");
					}

				} else if (player.getPlayerHand().getHandValue() == 21) {
					System.out.println("You have hit 21, it is now the dealers turn");
					System.out.println("");
					dealerRun();
				}
			} else if (choice.contentEquals("2") || choice.contentEquals("two") || choice.contentEquals("stay")) {
				if (playerUseSoftAce) {
					System.out.println("You have chosen to stay at " + player.getPlayerHand().getSoftAceValue()
							+ " it is now the dealers turn.");
				} else {
					System.out.println("You have chosen to stay at " + player.getPlayerHand().getHandValue()
							+ " it is now the dealers turn.");
				}
				dealerRun();
			}
		}
	}

	private void dealerRun() {
		System.out.println("");
		System.out.println("Dealer's Hand: ");
		System.out.println(dealer.toString());

		if (dealer.getDealerHand().getHandValue() > 21) {
			System.out.println("The dealer busts  with " + dealer.getDealerHand().getHandValue()+" you win");
		}

		else if (dealer.getDealerHand().getHandValue() == 21) {
			System.out.println("The Dealer has hit 21, lets see who wins");
			System.out.println("");
			compareResult();

		}

		else if (dealer.getDealerHand().getHandValue() >= 17)

		{
			compareResult();

		} else  
		{
			dealer.addCardToHand();
			dealerRun();
		}
	}

	private void compareResult() {
		System.out.println("Comparing hands....");
		if (dealer.getDealerHand().getHandValue() > player.getPlayerHand().getHandValue()) {
			System.out.println("The Dealer has won with " + dealer.getDealerHand().getHandValue());
		} else if (dealer.getDealerHand().getHandValue() < player.getPlayerHand().getHandValue()) {
			System.out.println("The Player has won with " + player.getPlayerHand().getHandValue());
		} else if (dealer.getDealerHand().getHandValue() == player.getPlayerHand().getHandValue()) {
			System.out.println("The game is a tie, both you and the dealer have "+dealer.getDealerHand().getHandValue());
		}
	}

	public void dealStart() {
		player.addCardToHand(dealer.dealCardFromDeck());
		player.addCardToHand(dealer.dealCardFromDeck());
		dealer.addCardToHand();
		dealer.addCardToHand();
		System.out.println("Player's Hand: ");
		System.out.println(player.toString());
		System.out.println();
		System.out.println("Dealer's Hand: ");
		System.out.println(dealer.toStringHidden());
	}
}