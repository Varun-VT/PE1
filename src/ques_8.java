import java.util.Random;
import java.util.Scanner;

public class ques_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int r = rand.nextInt(50);
        int n = sc.nextInt();
        while (n != r) {
            if (n> r){
                System.out.println("Number guessed is more than original number");
            }
            else if (n<r){
                System.out.println("Number guessed is less than original number");
            }
            else {
                System.out.println("Number guessed matches the original number");
                break;
            }
            n = sc.nextInt();
        }
        if(n ==r){
            System.out.println("Number guessed matches the original number");
        }
    }
}
