class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        boolean[] flags = new boolean[my_string.length()];
        for (int i : indices) {
            flags[i] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < flags.length; i++) {
            if (!flags[i])
                sb.append(my_string.charAt(i));
        }
        answer = sb.toString();
        return answer;
    }
}