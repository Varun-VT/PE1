package allimplementedquestions;

import java.util.Scanner;

public class ques_10 {
        public static void main()
        {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            int n= sc.nextInt();
            String fin="";
            int l= s.length();
            fin= s.substring(l-n);

            for(int i=0;i<n;i++) {
                s=s+fin;
            }
            System.out.println(s);
            sc.close();
        }

    }

