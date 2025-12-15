import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int attendant = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int tShirts[] = Stream.generate(() -> Integer.parseInt(st.nextToken()))
                              .limit(6)
                              .mapToInt(i -> i)
                              .toArray();

        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        int T = Integer.parseInt(st2.nextToken());
        int P = Integer.parseInt(st2.nextToken());

        int orderTShirtsBundle = (int) Arrays.stream(tShirts)
                                             .mapToDouble(i -> Math.ceil(i / (double) T))
                                             .sum();

        int orderPenBundle = attendant / P;
        int orderPenOne = attendant % P;
        
        bw.write(orderTShirtsBundle + "\n");
        bw.write(orderPenBundle + " " + orderPenOne + "\n");
        bw.flush();
        bw.close();
    }
}


