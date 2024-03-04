import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  //바구니 개수
        int arr[] = new int[N];
        int M = Integer.parseInt(st.nextToken());  //공을 넣는 횟수
        int temp;
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());

            temp = arr[I - 1];
            arr[I - 1] = arr[J - 1];
            arr[J - 1] = temp;
        }
        for (int k = 0; k < arr.length; k++)
            System.out.print(arr[k] + " ");
        br.close();
    }
}