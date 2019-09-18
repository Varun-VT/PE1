package com.MathApp;
import allimplementedquestions.*;

import java.util.Scanner;

public class allquestions{

    public static void main(String[] args){
        System.out.println("Menu: \nEnter 1 for checking palindrome;\n" +
                "Enter 2 for performing conditional checks\n"+
                "Enter 3 for printing corresponding vowel and consonent\n"+
                "Enter 4 for printing 1 2 2 3 3 3 like sequence\n" +
                "Enter 5 for adding all inputted numbers\n" +
                "Enter 6 for determining whether input is capital/ digit/ symbol\n" +
                "Enter 7 for sorting numbers in decreasing order\n"+
                "Enter 8 for performing guess the number\n"+
                "Enter 9 for reversing a string\n"+
                "Enter 10 for string manipulation like Stackroutetete\n");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        String s= "ques_"+ Integer.toString(a);
        switch (a){
            case 1: ques_1.main();
                    break;
            case 2:ques_2.main();
                    break;
            case 3: ques_3.main();
                    break;
            case 4: ques_4.main();
                    break;
            case 5: ques_5.main();
                    break;
            case 6: ques_6.main();
                break;
            case 7: ques_7.main();
                    break;
            case 8: ques_8.main();
                break;
            case 9: ques_9.main();
                break;
            case 10:ques_10.main();
                break;
            default: System.out.println("Invalid Input");
}
}
}