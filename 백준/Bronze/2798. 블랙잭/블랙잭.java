import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());  //람다식은 변수를 가져다 쓸 때, final(상수)이거나 effectively final(값이 한번도 바뀌지 않은 변수) 이어야 한다.
        int cards[] = Stream.generate(() -> Integer.parseInt(st2.nextToken())).limit(N).mapToInt(i -> i).toArray();
        int max = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= M) {
                        max = Math.max(max, sum);
                    }
                }
            }
        }

        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }
}