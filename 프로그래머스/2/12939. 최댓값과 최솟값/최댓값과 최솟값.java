import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<Integer> arr = new ArrayList<>();
        String[] s1 = s.split(" ");
        for(String s2 : s1){
            arr.add(Integer.parseInt(s2));
        }
        answer += "" + Collections.min(arr) + " " + Collections.max(arr);
        return answer;
    }
}