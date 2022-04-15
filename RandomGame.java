import java.util.Scanner;

public class RandomGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number");
        int num = input.nextInt();
        int max = 100;
        int min = 0;
        int randomWithMathRandom = (int) ((Math.random() * (max - min)) + min);
        System.out.println(randomWithMathRandom);
        if (num == randomWithMathRandom){
            System.out.println("You hit the jackpot");
        }
        else if(num<randomWithMathRandom){
            System.out.println("Too little");
        }
        else if(num>randomWithMathRandom){
            System.out.println("Too much");
        }
        //         RandomGame rand = new RandomGame(); //instance of random class
        //       int upperbound = 100;
        //       int int_random = rand.nextInt();
        //      System.out.println("Random integer value from 0 to" + (upperbound-1) + " : "+ int_random);
    }
}
