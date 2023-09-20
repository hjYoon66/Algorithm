import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String s = new String();
        for(int i =arr.length-1;i>=0;i--){
            s+=arr[i];
        }
        answer = Long.parseLong(s);
        return answer;
    }
}