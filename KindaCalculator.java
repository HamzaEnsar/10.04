import java.util.Scanner;

public class KindaCalculator {
    public static void main(String[] args) {
        double arth1 = 0;
        double arth2 = 0;
        int counter1 = 0;
        int counter2 = 0;
        double x1 = 0;
        double x2 = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int guess = input.nextInt();
        String temp = Integer.toString(guess);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            newGuess[i] = temp.charAt(i) - '0';
        }


        for (int i = 0; i < newGuess.length; i++) {
            if (newGuess[i] % 2 != 0) {

                x1 += newGuess[i];
                counter1++;

            }

        }

        for (int j = 0; j < newGuess.length; j++) {
            if (newGuess[j] % 2 == 0) {

                x2 += newGuess[j];
                counter2++;

            }

        }
        arth1 = x1 / counter1;
        arth2 = x2 / counter2;
        System.out.println("Arithmetic mean of even digits:  " + arth2);
        System.out.println("Arithmetic mean of odd digits:  " + arth1);
        double rat = arth2 / arth1;
        System.out.println("The ratio is:    "+rat);
    }

}






