import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> term = new HashMap<>();
        
        int date = getDate(today); 
        
        for(String t : terms){
            String type = t.split(" ")[0];
            int range = Integer.parseInt(t.split(" ")[1]);
            term.put(type, range);
        }
        
        for(int i = 0;i<privacies.length;i++){
            String[] privacy = privacies[i].split(" ");
            
            if(getDate(privacy[0])+(term.get(privacy[1])*28) <= date){
                list.add(i+1);
            }
        }
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;      
    }
    
    private int getDate(String today){
        String[] date = today.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return (year*12*28) + (month*28) + day;
    }      
}