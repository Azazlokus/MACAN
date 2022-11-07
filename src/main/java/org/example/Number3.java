package org.example;

public class Number3 {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static void getResult3(){
        long startTime = System.nanoTime();

        String targetString = "сон фваа вфвм нос дом мод";
        String targetWord = "";
        String[] words = targetString.trim().split(" ");
        System.out.println("Target string: "+targetString);
        for(String word : words){
            for(String comparedWord : words){
                if(word.equals(reverse(comparedWord))){
                    System.out.println("Target word: "+word);
                    break;
                }
            }

        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println("Time of work: "+duration+" nanosec = "+duration/1000000000+" sec");
    }
}
