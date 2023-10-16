import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        int value = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != value){
                list.add(arr[i]);
                value = arr[i];
            }
        }        
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}