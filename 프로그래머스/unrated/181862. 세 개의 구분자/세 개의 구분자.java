import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        String temp = "";
        List<String> list = new ArrayList<>();
        for(char c : myStr.toCharArray()){
            if(c == 'a' || c == 'b' || c == 'c'){
                if(temp != ""){
                    list.add(temp);
                    temp = "";
                }
            }else{
                temp+=c;
            }
        }
        if(temp != ""){
            list.add(temp);
            temp = "";
        }
        if(list.size() == 0)
            list.add("EMPTY");
        answer = list.toArray(new String[list.size()]);
        return answer;
    }
}