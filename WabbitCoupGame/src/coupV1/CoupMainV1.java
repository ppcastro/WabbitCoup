package coupV1;

import java.util.Scanner;
import java.util.Random;

public class CoupMainV1 {
	
	public static String userName1, userName2;
	
	public static void main (String[]args) {

		//createUser();
		assignInfluence();
	}
	
//	public static String createUser(){
//		Scanner scanUser1 = new Scanner(System.in);
//		Scanner scanUser2 = new Scanner(System.in);
//		
//		System.out.println("Please enter user name #1: ");
//		userName1 = scanUser1.nextLine();
//		return userName1;
//		
//	}
//	
//	public static String[] createDeck() {
//		Random random = new Random();
//		final String [] cards = new String [] {
//				"duke", "duke", "duke", "duke", "duke",
//				"capt", "capt", "capt", "capt", "capt", 
//				"amba", "amba", "amba", "amba", "amba", 
//				"assn", "assn", "assn", "assn", "assn", 
//				"cont", "cont", "cont", "cont", "cont"};
//		return cards;
//	}
	

	public static void assignInfluence() {
		String [] hand = new String [1];
		Random random = new Random();
		int cardIndex;
		int dukeCount, captCount, ambaCount, assnCount, contCount;
		final String [] cards = new String [] {
				"duke", "duke", "duke", "duke", "duke",
				"capt", "capt", "capt", "capt", "capt", 
				"amba", "amba", "amba", "amba", "amba", 
				"assn", "assn", "assn", "assn", "assn", 
				"cont", "cont", "cont", "cont", "cont"};
		
		for (int i = 0; i<hand.length;i++) {
			cardIndex=random.nextInt(cards.length);
			System.out.println(cards[cardIndex]);
			//hand[i]=cards[cardIndex];
		}
		System.out.println("Your Influences are: " + hand[0] + " and " + hand[1]);
	}

	public static void action() {

	}

	public static void counterAction() {
		
	}
	
	public static void validateInfluence() {
		
	}
}
