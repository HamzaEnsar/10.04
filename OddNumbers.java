import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number :");
        int num1 = input.nextInt();
        for (int num = 0; num1 >num; num+=3) {
            System.out.println(num);
        }
    }

}
