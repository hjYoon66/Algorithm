import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        List<String> list = new ArrayList<>();

        for(int i = 0; i<picture.length;i++){
            String[] p = picture[i].split("");
            String str = "";
            for(int j = 0 ;j<p.length;j++)
                str+=p[j].repeat(k);
            for(int j = 0;j<k;j++)
                list.add(str);
        }
        answer = list.toArray(new String[list.size()]);
        return answer;
    }
}