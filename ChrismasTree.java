import java.util.Scanner;

public class ChrismasTree {


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of tree: ");
        int h = input.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = h - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}



