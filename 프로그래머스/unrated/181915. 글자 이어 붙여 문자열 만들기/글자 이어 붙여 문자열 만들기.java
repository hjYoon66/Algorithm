class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int list : index_list){
            char c = my_string.charAt(list);
            answer += c;
        }
        return answer;
    }
}