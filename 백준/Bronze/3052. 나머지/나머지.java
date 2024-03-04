import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean arr[] = new boolean[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n % 42] = true;
        }
        for (boolean value : arr) {
            if (value) {
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}