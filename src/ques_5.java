import java.util.Scanner;

public class ques_5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number, sum=0;
        try {
            while((number = sc.nextInt()) != 0) {
                sum+=number;

            }
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println("InputMismatchException");
        }

        sc.close();
    }

}
