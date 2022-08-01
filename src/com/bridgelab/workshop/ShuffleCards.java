package com.bridgelab.workshop;

public class ShuffleCards {

    public static void shuffleCards(String[][] arr) {

        String result;
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <13 ; j++) {
                int array1=(int)(Math.random()*10)%4;
                int array2=(int)(Math.random()*10)%13;
                result = arr[i][j];

                arr[i][j] = arr[array1][array2];
                arr[array1][array2] = result;
            }

        }
    }
}
