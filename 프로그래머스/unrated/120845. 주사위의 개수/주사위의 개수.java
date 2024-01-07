class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int k = box[0] / n;
        int m = box[1] / n;
        int h = box[2] / n;
        answer = k*m*h;
        return answer;
    }
}