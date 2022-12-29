package Lv0;

class 순서쌍의개수 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }

        // 순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
        // 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return
        return answer;
    }

    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 100;

        int answer1 = new 순서쌍의개수().solution(n1);
        int answer2 = new 순서쌍의개수().solution(n2);

        System.out.println("곱이 " + n1 + "인 순서쌍은 " + answer1 + "개 입니다.");
        System.out.println("곱이 " + n2 + "인 순서쌍은 " + answer2 + "개 입니다.");
    }
}