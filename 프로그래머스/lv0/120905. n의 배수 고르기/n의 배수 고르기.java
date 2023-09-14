import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int num : numlist){
            if(num%n==0)
                list.add(num);
        }
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}