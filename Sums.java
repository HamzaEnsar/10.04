import java.util.Scanner;

public class Sums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input an integer");
        int num1 = input.nextInt();
        System.out.println("Please input an integer");
        int num2 = input.nextInt();
        int sum = 0;
        do {
            sum += num1;
            num1++;

        }
        while (num2 > num1);
        System.out.println(sum);
    }


}



