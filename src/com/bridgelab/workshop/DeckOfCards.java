package com.bridgelab.workshop;

public class DeckOfCards {
    public static void main(String[] args)
    {
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};
        String[][] cardsArray = new String[4][13];

        for(int i=0;i<4;i++) {
            System.out.println();
            for (int j = 0; j < 13; j++) {
                cardsArray[i][j] = suit[i] + ' ' + rank[j];
                System.out.println(cardsArray[i][j]);
            }
        }
    }
}


