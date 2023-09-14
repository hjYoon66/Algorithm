import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        List<Integer> list = new ArrayList<>();
        int odd = 0;
        int even = 0;
        for(int num : num_list){
            if(num%2==0)
                even++;
            else
                odd++;
        }
        list.add(even);
        list.add(odd);
        answer=list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}