
import java.util.*;
class Solution {
    public int[] solution(String myString) {
        int[] answer ={};
        String[] arr = myString.split("x",myString.length());
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<arr.length;i++)
            list.add(arr[i].length());
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}