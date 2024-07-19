package org.example;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the staircase number");
        int stairs= in.nextInt();
        int count[]=new int[stairs+1];
        count[0]=1;
        count[1]=1;
        for (int i=2;i<count.length;i++)
        {
            count[i]=count[i-1]+count[i-2];
        }
        System.out.println("No of ways to climb is "+ count[count.length-1]);
    }
}
