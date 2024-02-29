import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalPrice = in.nextInt();
        int numObject = in.nextInt();
        int total = 0;

        for (int i = 0; i < numObject; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            total += a * b;
        }
        if (total == totalPrice)
            System.out.println("Yes");
        else System.out.println("No");
    }
}