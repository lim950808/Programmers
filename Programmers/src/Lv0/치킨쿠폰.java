package Lv0;

class 치킨쿠폰 {
    public int solution(int chicken) {
        int answer = 0; // 받을 수 있는 최대 서비스 치킨의 수
        int quotient = 0; // 몫
        int remainder = 0; // 나머지

        // 시켜먹은 치킨의 수 chicken
        // 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급
        // 쿠폰을 10장 모으면 치킨을 1마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다.
        while (chicken >= 10) {
            quotient = chicken / 10; // 치킨의 수를 10으로 나눈 몫
            remainder = chicken % 10; // 치킨의 수를 10으로 나눈 나머지
            answer += quotient; // 몫을 더해줌
            chicken = quotient + remainder; // 몫 + 나머지
        }

        // 받을 수 있는 최대 서비스 치킨의 수를 return
        return answer;
    }

    public static void main(String[] args) {
        int answer1 = new 치킨쿠폰().solution(100);
        int answer2 = new 치킨쿠폰().solution(1081);

        System.out.println(answer1); // 11
        System.out.println(answer2); // 120
    }
}