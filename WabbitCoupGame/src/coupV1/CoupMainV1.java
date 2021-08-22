package coupV1;

import java.util.Scanner;
import java.util.Random;

public class CoupMainV1 {
	
	public static String userName1, userName2;
	
	public static void main (String[]args) {

		//createUser();
		createDeck();
	}
	
	public static String createUser(){
		Scanner scanUser1 = new Scanner(System.in);
		Scanner scanUser2 = new Scanner(System.in);
		
		System.out.println("Please enter user name #1: ");
		userName1 = scanUser1.nextLine();
		return userName1;
		
	}
	
	public static String[] createDeck() {
		
		final String [] cards = new String [] {
				"duke", "duke", "duke", "duke", "duke",
				"capt", "capt", "capt", "capt", "capt", 
				"amba", "amba", "amba", "amba", "amba", 
				"assn", "assn", "assn", "assn", "assn", 
				"cont", "cont", "cont", "cont", "cont"};
		return cards;
	}
	
	public static void assignCards() {
		
	}
	
	public static void assignInfluence() {
		
	}

	public static void action() {
		
	}

	public static void counterAction() {
		
	}
	
	public static void validateInfluence() {
		
	}
}
