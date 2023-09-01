import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] strArr = myString.split("x");
        String[] answer ={};
        List<String> list = new ArrayList<>();
        
        for(String str : strArr){
            if(!str.isEmpty()){
                list.add(str);
            }
        }
        answer = list.toArray(new String[list.size()]);
        Arrays.sort(answer);        
        return answer;
    }
}