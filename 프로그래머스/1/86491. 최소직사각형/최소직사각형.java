import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int m = 0;
        int n = 0;
        for(int i = 0;i<sizes.length;i++){
            int v = Math.max(sizes[i][0],sizes[i][1]);
            int h = Math.min(sizes[i][0],sizes[i][1]);
            m = Math.max(m,v);
            n = Math.max(n,h);
        }
        answer = m * n;
        
        return answer;
    }
}