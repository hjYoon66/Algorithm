import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = t.length() - p.length()+1;
        for(int i = 0;i<length;i++){
            String s = t.substring(i,i+p.length());        
            if(Long.parseLong(s) <= Long.parseLong(p)){
                answer++;
            }
        }
        
        return answer;
    }
}