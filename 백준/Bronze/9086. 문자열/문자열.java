import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String arr[] = new String[T];
        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            arr[i] = s.substring(0, 1) + s.substring(s.length() - 1, s.length());
        }
        br.close();
        for (int i = 0; i < T; i++)
            System.out.println(arr[i]);
    }
}