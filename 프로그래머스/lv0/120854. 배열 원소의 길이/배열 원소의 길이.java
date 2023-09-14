import java.util.*;
class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(String str : strlist)
            list.add(str.length());
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}