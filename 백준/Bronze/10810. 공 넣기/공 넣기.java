import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  //바구니 개수
        int arr[] = new int[N];
        int M = Integer.parseInt(st.nextToken());  //공을 넣는 횟수

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            for (int j = I - 1; j < J; j++)
                arr[j] = K;
        }
        for (int k = 0; k < arr.length; k++)
            System.out.print(arr[k] + " ");
        br.close();
    }
}