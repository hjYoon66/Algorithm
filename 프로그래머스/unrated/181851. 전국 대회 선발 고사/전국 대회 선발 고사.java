import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<rank.length;i++)
            map.put(rank[i],i);
        
        for(int i = 0;i<rank.length;i++){
            if(attendance[i])
                list.add(rank[i]);
        }
        Collections.sort(list);
        
        int a = map.getOrDefault(list.get(0),0);
        int b = map.getOrDefault(list.get(1),1);
        int c = map.getOrDefault(list.get(2),2);
        
        answer = a*10000 + b*100 + c;
            
        return answer;
    }
}