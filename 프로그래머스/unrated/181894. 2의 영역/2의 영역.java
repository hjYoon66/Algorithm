import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int first = -1;
        int last = -1;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                first = i;
                break;
            }
        }
        if(first != -1){
            for(int i= 0;i<arr.length;i++){
                if(arr[i]==2)
                    last = i;
            }
        }
        if(first == -1)
            list.add(-1);
        else if(first == last)
            list.add(2);
        else
            for(int i= first; i<=last;i++)
                list.add(arr[i]);
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}