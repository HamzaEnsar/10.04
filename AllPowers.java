import java.util.Scanner;

public class AllPowers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input an integer : ");
        int num1 = input.nextInt();
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0)
                System.out.print(i+ " ");
        }
    }
}