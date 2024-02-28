import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String b = in.next();
        char[] br = b.toCharArray();
        System.out.println(a * Integer.parseInt(String.valueOf(br[2])));
        System.out.println(a * Integer.parseInt(String.valueOf(br[1])));
        System.out.println(a * Integer.parseInt(String.valueOf(br[0])));
        System.out.println(a * Integer.parseInt(b));
    }
}