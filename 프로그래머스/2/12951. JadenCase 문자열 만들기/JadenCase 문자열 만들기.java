class Solution {
    public String solution(String s) {
        String answer = "";
        String[] s1 = s.split(" ");
        for(int i = 0;i<s1.length;i++){
            if(s1[i].length()==0){
                answer+=" ";
            }else{
                answer+=s1[i].substring(0,1).toUpperCase();
                answer+=s1[i].substring(1,s1[i].length()).toLowerCase();
                answer+=" ";
            }
        }
        if(s.substring(s.length()-1,s.length()).equals(" "))return answer;
        
        return answer.substring(0, answer.length()-1);
    }
}