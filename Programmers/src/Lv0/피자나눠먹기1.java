package Lv0;

class 피자나눠먹기1 {
    public int solution(int n) {
        int answer = 0;
        int a = n / 7;
        int b = n % 7;

        if(b == 0) {
            answer = a * 1;
        } else if (b != 0) {
            answer = a * 1 + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int answer1 = new 피자나눠먹기1().solution(7);
        int answer2 = new 피자나눠먹기1().solution(1);
        int answer3 = new 피자나눠먹기1().solution(15);

        System.out.println(answer1); // 1
        System.out.println(answer2); // 1
        System.out.println(answer3); // 3
    }
}