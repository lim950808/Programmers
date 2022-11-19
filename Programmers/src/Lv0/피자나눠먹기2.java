package Lv0;

class 피자나눠먹기2 {
    public int solution(int n) {
        int answer = 1;

        while (true) {
            if (6 * answer % n == 0) break; // 피자는 6조각으로 밖에 안 잘라줌.
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int answer1 = new 피자나눠먹기2().solution(6);
        int answer2 = new 피자나눠먹기2().solution(10);
        int answer3 = new 피자나눠먹기2().solution(4);

        System.out.println(answer1); // 1
        System.out.println(answer2); // 5
        System.out.println(answer3); // 2
    }
}