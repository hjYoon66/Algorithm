class Solution {
    public int solution(int a, int b) {
        String s1 = String.valueOf(a)+String.valueOf(b);
        String s2 = String.valueOf(b)+String.valueOf(a);
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        
        int answer = 0;
        if(i1>i2){
            answer = i1;
            return answer;
        }else{
            answer = i2;
            return answer;
        }
        
    }
}