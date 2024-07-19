package org.example;

import java.util.Scanner;

public class LongestPalindrom {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=in.nextLine();
        int low=0,end=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(low)==s.charAt(end))
            {
                palindrom(s,low+1,end-1);
            }
            else{
                low++;
                end--;
            }
        }


    }

    private static void palindrom(String s, int low, int end) {
        String rev = "";
        String org = "";

        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;
        for (int i = low; i <= end; i++) {
            org = org + s.charAt(i);
        }

        for (int i = end; i >= low; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(org);
        System.out.println(rev);

        // Checking if both the strings are equal
        if (org.equals(rev)) {
            ans = true;
            System.out.println(org);
        }

    }
}
