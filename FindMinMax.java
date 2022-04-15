import java.util.Arrays;
import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input an integer : ");
        double a = input.nextInt();
        System.out.println("Please input an integer : ");
        double b = input.nextInt();
        System.out.println("Please input an integer : ");
        double c = input.nextInt();
        System.out.println("Please input an integer : ");
        double d = input.nextInt();
        System.out.println("Please input an integer : ");
        double e = input.nextInt();
        double numbers[] = {a, b, c, d, e};

        Arrays.sort(numbers);
        System.out.println("Minimum =  " + numbers[0]);
        System.out.println("Maximum =  " + numbers[numbers.length - 1]);
        System.out.println("Mean = " + numbers[numbers.length - 1]/numbers[0] );
        System.out.println("Sum: " + Arrays.stream(numbers).sum());
    }
}
