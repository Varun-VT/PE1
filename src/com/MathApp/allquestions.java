package com.MathApp;

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
            case 1:
                ques_1 q1= new ques_1();
                q1.palindrome();
                    break;
            case 2:ques_2 q2= new ques_2();
                q2.lessOrMoreThan20();
                    break;
            case 3: ques_3 q3= new ques_3();
                q3.labelItAsVowOrCons();
                    break;
            case 4: ques_4 q4= new ques_4();
                q4.makePattern();
                    break;
            case 5: ques_5 q5= new ques_5();
                q5.sumOfNumbers();
                    break;
            case 6: ques_6 q6= new ques_6();
                q6.isCapitalDigitSmallSpecial();
                break;
            case 7: ques_7 q7= new ques_7();
                q7.listOfNumbersSortAndSum();
                    break;
            case 8: ques_8 q8= new ques_8();
                q8.guessTheTargetNumber();
                break;
            case 9: ques_9 q9= new ques_9();
                q9.reverseTheString();
                break;
            case 10:ques_10 q10= new ques_10();
                q10.printLikeStacacacPattern();
                break;
            default: System.out.println("Invalid Input");
}
}
}