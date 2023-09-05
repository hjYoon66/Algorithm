import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        Arrays.sort(num_list);
        
        for(int i =5; i<num_list.length;i++)
            list.add(num_list[i]);
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}