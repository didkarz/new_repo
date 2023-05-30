import java.util.Random;
import java.util.Scanner;

public class h2 {

    public static int playGame(int g){
        Scanner in = new Scanner(System.in);
        int n;
        do{
            System.out.println("Guess the number:");
            n = in.nextInt();
            if(n>g){
                System.out.println("Too high, try again!”");
            } else if (n<g) {
                System.out.println("“Too low, try again!");
            }
        }while (n!=g);
        return n;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int g = rand.nextInt(20) + 1;
        System.out.println("You guessed right " + playGame(g) + " is the correct number");
    }


}
