class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String oddList = "";
        String evenList = "";
        
        for(int i = 0; i<num_list.length;i++){
           if(num_list[i]%2 == 1) 
               oddList += String.valueOf(num_list[i]);
            else
                evenList += String.valueOf(num_list[i]);
        }
        answer = Integer.parseInt(oddList)+ Integer.parseInt(evenList);
        return answer;
    }
}