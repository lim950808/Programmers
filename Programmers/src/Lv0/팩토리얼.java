package Lv0;

class 팩토리얼 {
    public int solution(int n) {
        // i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다.
        int factorial = 1;
        int i = 0;

        while (true) {
            // n 까지의 숫자를 하나씩 더하며 곱함
            if (factorial <= n) {
                factorial *= i + 1;
                i++;
            } else {
                break;
            }
        }

        // 조건을 만족하는 가장 큰 정수 i를 return
        return i - 1;
    }

    public static void main(String[] args) {
        int answer1 = new 팩토리얼().solution(3628800);
        int answer2 = new 팩토리얼().solution(7);

        System.out.println(answer1); // 10
        System.out.println(answer2); // 3
    }
}