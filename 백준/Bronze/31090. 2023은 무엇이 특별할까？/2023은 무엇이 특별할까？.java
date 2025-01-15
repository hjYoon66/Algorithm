import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int lastTwoDigits = N % 100;
            int nextYear = N + 1;
            sb.append(nextYear % lastTwoDigits == 0 ? "Good\n" : "Bye\n");
        }

        System.out.print(sb);
    }
}
