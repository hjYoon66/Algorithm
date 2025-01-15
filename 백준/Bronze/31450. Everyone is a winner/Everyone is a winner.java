import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());  //메달 수
        int K = Integer.parseInt(st.nextToken());  //아이들 수

        System.out.println(M % K == 0 ? "Yes" : "No");
    }
}
