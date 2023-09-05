import java.util.*;
class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        int idx = arr.length % 2 ==0 ? 1 : 0;
        for(int i = idx; i < arr.length; i += 2){
            arr[i] +=n;
        }
        answer = arr;
        return answer;
    }
}
