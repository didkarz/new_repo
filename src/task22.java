import java.util.Scanner;

public class task22 {
    public static void printWord(String w) {
        int i = 1;
        do {
            System.out.println(w);
            i += 1;
        } while (i <= 10);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String w = in.next();
        printWord(w);

    }
}
