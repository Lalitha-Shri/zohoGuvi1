package org.example;

import java.util.Scanner;

public class StringSequence {
    public static int maxRepeating(String sequence, String word) {
        String wordToFind = word;
        int count = 0, begenning = 0;
        while(true) {
            int index = sequence.substring(begenning).indexOf(wordToFind);
            if(index == -1)
                return count;
            else
                count++;
            wordToFind += word;
            begenning = index;
            }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String word=in.nextLine();
        String sequence=in.nextLine();
       int k= maxRepeating(sequence, word);
        System.out.println(k);
    }
}

