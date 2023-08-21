import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(String intStr : intStrs){
            String str = intStr.substring(s, s+l);    
            int a = Integer.parseInt(str);
            if(a>k)
                list.add(a);
        }
        
        answer = list.stream().mapToInt(i->i).toArray();        
        return answer;
    }
}