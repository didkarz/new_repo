import java.util.Scanner;

public class newTask2 {
    public static void printText(String t,int p){

        int i = 1;
        do{
        System.out.println(t);
        i+=1;
        } while (i <= p);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter text: ");
        String t = in.next();
        System.out.println("Enter how many to print: ");
        int p = in.nextInt();
        printText(t,p);
    }
}
