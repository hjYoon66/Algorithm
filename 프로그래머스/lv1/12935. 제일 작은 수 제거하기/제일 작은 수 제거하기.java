import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length <= 1) return new int[]{-1};
        int min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0;i<arr.length;i++){
            list.add(arr[i]);
            if(min>arr[i]) 
                min = arr[i];
        }
        list.remove(list.indexOf(min));
        
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}