import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isGroupWord(String word) {
        boolean alpha[] = new boolean[26];
        char prev = '\0';

        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);

            if (current != prev) {
                if (alpha[current - 'a']) {
                    return false;
                }
                alpha[current - 'a'] = true;
            }
            prev = current;
        }

        return true;
    }

}
