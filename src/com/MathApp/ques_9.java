package com.MathApp;

import java.util.Scanner;

public class ques_9 {
    public ques_9() {
    }
    public static void reverseTheString() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = "";

        for(int i = str.length()-1; i >=0; i--) {
            s=s+ str.charAt(i);
        }

        System.out.println(s);
    }
}