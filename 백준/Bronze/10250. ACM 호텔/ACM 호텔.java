import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());  //호텔의 층 수
            int W = Integer.parseInt(st.nextToken());  //각 층의 방 수
            int N = Integer.parseInt(st.nextToken());  // 몇번쨰 손님

            int floor = N % H;
            int room = (N / H) + 1;
            if (0 == floor) {
                floor = H;
                room = N / H;
            }
            sb.append(floor);
            if (room < 10) {
                sb.append("0");
            }
            sb.append(room).append("\n");
        }
        System.out.println(sb);

    }
}