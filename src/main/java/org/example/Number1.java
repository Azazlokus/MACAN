package org.example;

import java.util.Scanner;

public class Number1 {
    public static void getResult1() throws Exception {
        long startTime = System.nanoTime();
        System.out.println("№1");
        System.out.println();
        int n = 0;
        int m = 0;
        int[][] matrix;

        Scanner in = new Scanner(System.in);
        System.out.println("Input n: ");
        if (in.hasNextInt()) {
            n = in.nextInt();
            System.out.println("You have successfully entered a number: " + n);
        } else {
            System.out.println("Isn't correct input");
            throw new Exception("Isn't correct input");
        }
        System.out.println("Input m: ");
        if (in.hasNextInt()) {
            m = in.nextInt();
            System.out.println("You have successfully entered a number: " + m);
        } else {
            System.out.println("Isn't correct input");
            throw new Exception("Isn't correct input");

        }
        matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int)(Math.random()*20)-10;
            }
        }
        //--------------------------------
        System.out.println("Our matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {


                System.out.print((matrix[i][j])+" | ");
            }
            System.out.println();
            System.out.println("------------------------");
        }
        //-------------------------------------------
        int maxEl = -11;
        int maxStr = -1;
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++){
                if(matrix[i][j]>=maxEl){
                    maxEl = matrix[i][j];
                    maxStr = i;
                }
            }
        System.out.println("Max element = "+maxEl);
        System.out.println("Number of string with max element = "+maxStr);
        //----------------------------------------------
        int sumPoz;
        int multNeg;
        int numberOfTargetString = -1;
        for(int i=0; i<n; i++){
            sumPoz = 0;
            multNeg = 1;
            for(int j=0; j<m; j++){
                if(matrix[i][j]>0){
                    sumPoz+=matrix[i][j];
                }else {
                    multNeg*=matrix[i][j];
                }
            }
            if(multNeg>sumPoz){
                numberOfTargetString = i;
            }
        }
        if(numberOfTargetString == -1)
            System.out.println("Target string is not founded");
        else {
            System.out.println("Number of target string = " + numberOfTargetString);
            //---------------------------------------------------
            int c;
            for (int j = 0; j < m; j++) {
                c = matrix[maxStr][j];
                matrix[maxStr][j] = matrix[numberOfTargetString][j];
                matrix[numberOfTargetString][j] = c;
            }
            //---------------------------------------------------
            System.out.println("Result matrix: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {


                    System.out.print((matrix[i][j]) + " | ");
                }
                System.out.println();
                System.out.println("------------------------");

            }

        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println("Time of work: "+duration+" nanosec = "+duration/1000000000+" sec");
    }
}

