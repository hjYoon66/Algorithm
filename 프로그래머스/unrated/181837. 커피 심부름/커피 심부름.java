class Solution {
    public int solution(String[] order) {
        int answer = 0;
        int americano = 4500;
        int latte = 5000;
        for(String s : order){
            switch(s){
                case "iceamericano","americanoice","hotamericano","americanohot","americano","anything":
                    answer+=americano;
                    break;
                case "icecafelatte","cafelatteice","hotcafelatte","cafelattehot","cafelatte":
                    answer += latte;
                    break;
            }
        }
        return answer;
    }
}