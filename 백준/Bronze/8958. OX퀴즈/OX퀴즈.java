import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input; i++) {
            String st = br.readLine();
            int add = 0;
            int score = 0;

            for(int j = 0; j < st.length(); j++){
                if(st.charAt(j) == 'O'){
                    add++;
                    score += add;
                }else{
                    add = 0;
                }
            }
            sb.append(score + "\n");
        }
        System.out.print(sb);
    }
}