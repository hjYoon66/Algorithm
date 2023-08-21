class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        String answer = "";
        for(int i = 0; i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            
            StringBuilder s = new StringBuilder(sb.substring(start, end+1));
            s.reverse();
            sb.replace(start, end+1, s.toString());
            answer = sb.toString();
        }
        return answer;
    }
}