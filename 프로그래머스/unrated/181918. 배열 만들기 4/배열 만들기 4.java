import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<arr.length){
            if(list.size() == 0){
                list.add(arr[i]);
                i++;
            }else{
                int last = list.get(list.size()-1);
                if(list.size()!=0 && last<arr[i]){
                    list.add(arr[i]);
                    i++;
                }else{
                    list.remove(list.size()-1);
                }
            }
        }
        stk = list.stream().mapToInt(Integer::intValue).toArray();
        return stk;
    }
}