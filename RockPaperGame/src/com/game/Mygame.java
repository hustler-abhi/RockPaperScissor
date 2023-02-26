package com.game;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Mygame {

	public static void main(String[] args) {
		System.out.println("Welocome to Rock,Paper,scissors game !");
		while (true) {
			String[] arr = { "r", "p", "s" };
			String computerMove = arr[new Random().nextInt(arr.length)];
			Scanner sc = new Scanner(System.in);
			String playerMove;
			while (true) {

				System.out.println("please enter r,p or s !");
				playerMove = sc.next();
				if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
					break;
				} else {
					System.out.println("please enter valid move..!");
				}

			}
			System.out.println("computer move is: " + computerMove);
			if (playerMove.equals(computerMove)) {
				System.out.println("Tie!");
			} else if (playerMove.equals("r")) {
				if (computerMove.equals("p")) {
					System.out.println("opps! You lose 😢 !");
				} else {
					System.out.println("Hurray! You win 🤩 !");
				}
			} else if (playerMove.equals("p")) {
				if (computerMove.equals("s")) {
					System.out.println("opps! You lose 😢 !");
				} else {
					System.out.println("Hurray! You win 🤩 !");
				}
			} else if (playerMove.equals("s")) {
				if (computerMove.equals("r")) {
					System.out.println("opps! You lose 😢 !");
				} else {
					System.out.println("Hurray! You win 🤩!");
				}
			}
			System.out.println("u want to play again? y/n");
			String no = sc.next();
			if (no.equals("n")) {
				System.out.println("Thank you!");
				break;
			}

		}

	}

}
