class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        for(int indice : indices)
            sb.setCharAt(indice,' ');
        answer = sb.toString().replace(" ","");
        return answer;
    }
}