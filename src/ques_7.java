import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ques_7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        List<Integer> list = new ArrayList<Integer>();
        try {
            int next= sc.nextInt();
            while(next>=0){
                list.add(next);
                next= sc.nextInt();
            }
        } catch (Exception e) {}
        finally {
            Collections.sort(list);
            System.out.println(list);
            for (int i: list) {
                if (i%2 ==0){
                    sum= sum+ i;
                }

            }
            System.out.println("Sum of even numbers :"+sum);
            if (sum> 15)
                System.out.println("True");
            else
                System.out.println("False");
        }
        sc.close();
    }

}