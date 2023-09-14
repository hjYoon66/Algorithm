class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        for(int i = 10;i<=n;i+=10)
            k--;
        answer = 12000*n + 2000*k;

        return answer;
    }
}