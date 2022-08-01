package com.bridgelab.workshop;

import java.util.Arrays;
import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args)
    {
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};
        String[][] cardsArray = new String[4][13];


        //Player player =new Player();
        //player.players();

        // saving cards
        for(int i=0;i<4;i++) {
            System.out.println();
            for (int j = 0; j < 13; j++) {
                cardsArray[i][j] = suit[i] + ' ' + rank[j];
                System.out.println(cardsArray[i][j]);
            }
        }

        ShuffleCards.shuffleCards(cardsArray);

        // printing
        for(int i=0;i<4;i++) {
            System.out.println();
            for (int j = 0; j < 13; j++) {
                System.out.println(cardsArray[i][j]);
            }
        }


        // players
        Scanner scanner = new Scanner(System.in);
        int noOfPlayer=0;
        while(noOfPlayer > 4 || noOfPlayer < 2) {
            System.out.println("Enter no of Players (between 2 to 4)");
            noOfPlayer = scanner.nextInt();
        }

        Player[] players=new Player[noOfPlayer];

        for (int i = 0; i < noOfPlayer; i++) {
            System.out.println("Enter Player " + (i + 1) +" name");
            String name=scanner.next();
            players[i]=new Player(name);

        }
    }

}





