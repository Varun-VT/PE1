package allimplementedquestions;

import java.util.Scanner;

public class ques_4 {
    public static String prin(int n) {
        String s="";
        for(int i=0;i<n;i++) {
            s=s+n;
        }
        return s;
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String s="";

        for(int i=0;i<=n;i++) {
            s=s+prin(i);
        }
        System.out.println(s);
    }

}
