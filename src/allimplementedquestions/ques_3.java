package allimplementedquestions;

import java.util.Scanner;

public class ques_3 {
    static final char[] VOWEL = {'a','e','i','o','u','A','E','I','O','U'};
    static boolean isVowel(char ch){
        for (char c : VOWEL){
            if (c == ch)
                return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String f="";
        String s= sc.nextLine();
        for (int i=0;i<s.length();i++){
            boolean isVow =isVowel(s.charAt(i));
            if (isVow)
                f=f+"Vowel"+" ";
            else
                f= f+"Consonant"+" ";
        }
        System.out.println(f);

        sc.close();
    }

}