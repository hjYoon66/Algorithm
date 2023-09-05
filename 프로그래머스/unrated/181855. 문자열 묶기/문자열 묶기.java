import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(String str : strArr)
            map.put(str.length(),map.getOrDefault(str.length(),0)+1);
        
        int max=0;
        for(int count : map.values()){
            if(count >max)
                max = count;
        }
        answer = max;
        return answer;
    }
}