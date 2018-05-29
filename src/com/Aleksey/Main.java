package com.Aleksey;
import java.io.*;
import java.util.*;


public class Main {

    static int createPalindrome(int input, int b, int isOdd) {
        int n = input;
        int palin = input;
        if (isOdd == 1)
            n /= b;
        while (n > 0) {
            palin = palin * b + (n % b);
            n /= b;
        }
        return palin;
    }

    static void generatePaldindromes(int n) {
        int number;
        for (int j = 0; j < 2; j++) {
            int i = 1;
            while ((number = createPalindrome(i, 10, j % 2)) < n) {
                System.out.print(number + " ");
                i++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("please, enter the number ");
        Scanner plumbus = new Scanner(System.in);
        int plumb = plumbus.nextInt();
        if (plumb > 100) {
            System.out.println("you entered numbor is more than 100 ");
        }else{
            generatePaldindromes(plumb);}
    }
}


