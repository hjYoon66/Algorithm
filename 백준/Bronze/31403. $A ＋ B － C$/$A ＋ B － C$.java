import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();

        String S = A + B;
        int s = Integer.parseInt(S);

        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        int c = Integer.parseInt(C);

        int num1 = a + b - c;
        int num2 = s - c;

        System.out.println(num1);
        System.out.println(num2);

    }
}