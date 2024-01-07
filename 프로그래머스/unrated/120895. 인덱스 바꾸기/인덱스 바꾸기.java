class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String s[] = my_string.split("");
        String temp = s[num1];
        s[num1] = s[num2];
        s[num2] = temp;
        answer = String.join("",s); 
        return answer;
    }
}