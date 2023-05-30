import java.util.Scanner;

public class newTask1 {
    public static void printNum(int n){
        int d = 1;
        do {
            System.out.println(n);
            n-=1;
        }while(n>=1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = in.nextInt();
        printNum(n);
    }
}
