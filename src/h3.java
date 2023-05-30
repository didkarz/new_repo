import java.util.Scanner;

public class h3 {
    public static int divisionNum(int n){
        int sum = 0;
        int i = 0;
        do{
            sum = sum+i;
            i++;

        }while (n%i==0 || sum<=n && sum<n);
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = in.nextInt();

        if(divisionNum(n)==n){
            System.out.println("This is a perfect number ");
        }else {
            System.out.println( n + " is not a perfect number");
        }

    }
}
