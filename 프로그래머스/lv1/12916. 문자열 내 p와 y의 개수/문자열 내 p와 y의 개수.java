class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        String[] str = s.toLowerCase().split("");
        for(int i = 0; i<str.length;i++){
            if(str[i].equals("p"))
                p++;
            else if(str[i].equals("y"))
                y++;
        }
        if(p!=y)
            answer=false;
        return answer;
    }
}