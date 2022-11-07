package org.example;

import java.util.Scanner;

public class Number2 {
    public static void getResult2() throws Exception {
        long startTime = System.nanoTime();

        System.out.println("№2");
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
        //--------------------------------
        int countOfNeg =0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if(matrix[i][j]<0)
                    countOfNeg++;
        System.out.println("The quantity of negative numbers = "+countOfNeg);
        //--------------------------------
        int sum;
        for(int j=0; j<m; j++){
            sum=0;
        for(int i=0; i<n; i++) {
            if(matrix[i][j]<0)
                sum+=matrix[i][j];

        }
            System.out.println("Sum of negative numbers for "+
                    j+" column = " + sum);

        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println("Time of work: "+duration+" nanosec = "+duration/1000000000+" sec");
    }
}
