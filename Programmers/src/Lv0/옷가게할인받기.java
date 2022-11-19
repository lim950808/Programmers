package Lv0;

class 옷가게할인받기 {
    public int solution(int price) {
        // 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인
        // 구매한 옷의 가격 price
        if (price >= 500000) {
            price *= 0.8;
        } else if (price >= 300000) {
            price *= 0.9;
        } else if (price >= 100000) {
            price *= 0.95;
        }
        // 지불해야 할 금액을 return
        return price;
    }

    public static void main(String[] args) {
        int answer1 = new 옷가게할인받기().solution(150000);
        int answer2 = new 옷가게할인받기().solution(580000);

        System.out.println(answer1 + "원"); // 142500원
        System.out.println(answer2 + "원"); // 464000원
    }
}