/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.noisdev;

import java.util.Scanner;

/**
 *
 * @author Adrenaline Morphine
 */
public class DivisibleBy {

    public boolean check(String str, int divident) {
        int n = str.length();

        // Empty string
        if (n == 0) {
            return false;
        }

        // If there is single digit
        if (n == 1) {
            return ((str.charAt(0) - '0') % divident == 0);
        }

        // If there is double digit
        if (n == 2) {
            return (((str.charAt(n - 2) - '0') * 10 + (str.charAt(n - 1) - '0')) % divident == 0);
        }

        // If number formed by last three digits is
        // divisible by 8.
        int last = str.charAt(n - 1) - '0';
        int second_last = str.charAt(n - 2) - '0';
        int third_last = str.charAt(n - 3) - '0';

        return ((third_last * 100 + second_last * 10 + last) % divident == 0);
    }

    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        DivisibleBy by8 = new DivisibleBy();
        while (true) {
            System.out.println("Enter Value : ");
            str = s.nextLine();
            if (by8.check(str, 7)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
