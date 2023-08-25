import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i=1;i*k<=n;i++)
            list.add(k*i);
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}