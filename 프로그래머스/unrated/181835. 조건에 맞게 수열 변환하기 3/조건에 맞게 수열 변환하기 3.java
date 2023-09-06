import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int a : arr)
            list.add(k%2==0 ? a+k : a*k);
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}