import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        StringBuffer sb = new StringBuffer();

        for (int i = 1; i <= N / 4; i++)
            sb.append("long ");
        System.out.println(sb.append("int"));
    }
}