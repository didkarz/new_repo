import java.util.Scanner;

public class h1 {
    public static int sportBasketball(String b) {
        int n = 1;
        while (n <= 5) {
            System.out.println("Payer " + n);
            n++;
        }
        return n;
    }

    public static int sportVolleyball(String v) {
        int n = 1;
        while (n <= 6) {
            System.out.println("Player " + n);
            n++;
        }
        return n;
    }

    public static int sportFootball(String f) {
        int n = 1;
        while (n <= 11) {
            System.out.println("Player " + n);
            n++;
        }
        return n;
    }

    public static void chooseSport(String s) {
        String b = "basketball";
        String f = "football";
        String v = "volleyball";

        if (s.equals(b)) {
            sportBasketball(s);
        } else if (s.equals(v)) {
            sportVolleyball(s);
        } else if (s.equals(f)){
            sportFootball(s);
        } else {
            System.out.println("Error ");
            scanner(s);

        }
    }
    public static void scanner(String scan){
        Scanner in = new Scanner(System.in);
        System.out.println("Choose basketball, football or volleyball");
        String s = in.nextLine();
        chooseSport(s);

    }

        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            System.out.println("Choose basketball, football or volleyball");
            String s = in.nextLine();
            chooseSport(s);


        }

}
