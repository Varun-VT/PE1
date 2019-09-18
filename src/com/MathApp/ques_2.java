package com.MathApp;

import java.util.Scanner;

public class ques_2 {
    public static void lessOrMoreThan20()
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if (n%2==0 && n<=30 && n>=20){
            System.out.println("Jerry");
        }
        else if (n%2!=0 && n<=30 && n>=20){
            System.out.println("Tom");
        }
        sc.close();
    }

}
