import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//6의 배수로 늘어간다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        int firstRoom = 1;
        int lastRoom = 1;
        int count = 1;

        int i = 1;
        while (true) {
            if (firstRoom <= n && n <= lastRoom) {
                bw.write(count + "\n");
                break;
            }
            firstRoom = lastRoom + 1;
            lastRoom += 6 * i;
            count++;
            i++;
        }

        bw.flush();
        bw.close();
    }
}