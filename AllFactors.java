import java.util.Scanner;
public class AllFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer:  ");
        int number = input.nextInt();
        System.out.println("Divisors are :  ");
        for (int i=1;i<=number;i++)
            if (number%i==0)
                System.out.print(i+" ");
    }
}
