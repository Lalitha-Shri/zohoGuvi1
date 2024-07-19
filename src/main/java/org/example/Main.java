package org.example;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter total number of coins");
        int n=in.nextInt();
        Integer coins[]=new Integer[n];
        int coinCounter[]=new int[coins.length];

        System.out.println("Enter the coins");
        for (int i=0;i<n;i++)
        {
            coins[i]=in.nextInt();
        }
        System.out.println("Enter the total amount");
        int amount=in.nextInt();
        Arrays.sort(coins, Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            if(coins[i]<=amount){
                coinCounter[i]=amount/coins[i];
                 amount=amount%coins[i];
            }
        }
        System.out.println("Coins"+" "+"NoOfCoins");
        System.out.println("......................");
        for(int i=0;i<n;i++)
        {
            if(coinCounter[i]>0){
                sum=sum+coinCounter[i];
            System.out.println(coins[i]+"    "+coinCounter[i]);}
        }
        System.out.println("Total coins: "+sum);
        }
    }
