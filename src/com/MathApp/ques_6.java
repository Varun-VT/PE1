package com.MathApp;

import java.util.Scanner;

public class ques_6 {
    static final char[] VOWEL = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
    static final char[] SPECIALSYM= { '!','@', '#','$','%','^','&','*','(',')'};
    static boolean isVowel(char ch) {
        for (char vowel : VOWEL) {
            if (vowel == ch) {
                return true;
            }
        }
        return false;
    }
    static boolean isSpecChar(char ch) {
        for (char spec : SPECIALSYM) {
            if (spec == ch) {
                return true;
            }
        }
        return false;
    }
    static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }
    static boolean isLowerCase(char ch) {
        return ch >= 'a' && ch <= 'z';
    }
    static boolean isUpperCase(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }
    public static void isCapitalDigitSmallSpecial()
    {
        Scanner sc = new Scanner(System.in);
        int number, sum=0;
        char c;
        c = sc.next(".").charAt(0);
        if (isUpperCase(c))
            System.out.println("Capital letter");
        else if(isDigit(c))
            System.out.println("Digit");
        else if(isLowerCase(c))
            System.out.println("A Small Case Letter,");
        else if (isSpecChar(c))
            System.out.println("A Special Character");
        else
            System.out.println("Sorry we can't label your input");
        sc.close();
    }

}