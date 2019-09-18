package allimplementedquestions;

import java.util.Scanner;

public class ques_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean is_pal =false;
        String s1= new StringBuilder(s).reverse().toString();
        is_pal= s.equals(s1);

        int l= s.length();
        int sum=0;
        for(int i=0;i<l;i++) {
            int a=(int)s.charAt(i);
            if (a%2 ==0){
                sum+=a;
            }
        }
        if (is_pal && sum<25) {
            System.out.println(s+" is palindrome and sum of even numbers is less than 25");
        }
        else if (is_pal && sum>25){
            System.out.println(s+" is palindrome and sum of even numbers is greater than 25");
        }
        else if (is_pal==false){
            System.out.println(s+" is not palindrome");
        }
        sc.close();
    }

    public static class ques_4 {
        public static String prin(int n) {
            String s="";
            for(int i=0;i<n;i++) {
                s=s+n;
            }
            return s;
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            String s="";

            for(int i=0;i<=n;i++) {
                s=s+prin(i);
            }
            System.out.println(s);
        }

    }
}
