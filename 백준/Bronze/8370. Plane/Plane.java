import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 비즈니스 석 n1줄
 * 이코노미석 n2줄
 * 비즈니스석은 각 줄마다 k1개의 좌석이 있고
 * 이코노미석은 각 줄마다 k2개의 좌석이 있다.
 * 비행기 내의 모든 좌석 수의 합계를 구하라
 * 2 5 3 20 -> n1, k1, n2, k2
 * 70
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int businessLine = Integer.parseInt(st.nextToken());
        int businessSeat = Integer.parseInt(st.nextToken());
        int economyLine = Integer.parseInt(st.nextToken());
        int economySeat = Integer.parseInt(st.nextToken());

        int result = businessLine * businessSeat + economyLine * economySeat;

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}


