class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String oddList = "";
        String evenList = "";
        
        for(int list : num_list){
            if(list%2 == 1)
                oddList += ""+list;
            else
                evenList += ""+list;  
        }
        answer = Integer.parseInt(oddList)+ Integer.parseInt(evenList);
        return answer;
    }
}