import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LocalDateTime now = LocalDateTime.now();

        bw.write(now.getYear() + "\n");
        bw.write(now.getMonthValue() + "\n");
        bw.write(now.getDayOfMonth() + "\n");
        
        bw.flush();
        bw.close();
    }
}


