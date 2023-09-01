class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] strArr = binomial.split(" ");
        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[2]);
        
        if(strArr[1].equals("+")) 
            answer = a+b;
        else if(strArr[1].equals("-"))
            answer = a-b;
        else
            answer = a*b;
        return answer;
    }
}