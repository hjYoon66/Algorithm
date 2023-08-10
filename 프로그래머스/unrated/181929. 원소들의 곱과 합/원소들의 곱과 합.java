class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;
        
        for(int list : num_list){
            mul*=list;
            sum+=list;
        }
        answer = mul<Math.pow(sum,2) ? 1:0;
        return answer;
    }
}