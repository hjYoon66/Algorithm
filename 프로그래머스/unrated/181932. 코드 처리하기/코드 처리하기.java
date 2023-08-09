class Solution {
    public String solution(String code) {
        int mode = 0;
        String ret = "";
        for(int idx = 0; idx<code.length(); idx++){
            if(code.charAt(idx)=='1'){
                mode = 1- mode;
            }else if(idx%2 ==mode)
                ret+=code.charAt(idx);
        }
        return "".equals(ret) ? "EMPTY" : ret;
    }
}