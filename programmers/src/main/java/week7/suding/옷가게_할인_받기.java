package week7.suding;

public class 옷가게_할인_받기 {
    class Solution {
        public int solution(int price) {
            int answer = 0;

            if (price >= 500000) {
                answer = (int)(price - price * 0.2);
            } else if (price >= 300000) {
                answer = (int)(price - price * 0.1);
            } else if( price >= 100000) {
                answer = (int)(price - price * 0.05);
            } else {
                answer = price;
            }

            return answer;
        }
    }
}
