class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] num_list = number.split("");
        
        for(int i = 0;i<num_list.length;i++){
            answer += Integer.parseInt(num_list[i]);
        }
        answer %= 9;
        return answer;
    }
}