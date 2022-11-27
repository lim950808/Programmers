package Lv0;

class 합성수찾기 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int cnt = 0; // 약수의 개수 cnt
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) // 나머지가 0일 때만 약수(cnt)에 추가됨
                    cnt++;
            }
            if (cnt >= 3) // 약수의 개수가 3개 이상일 때만 합성수(answer)에 추가됨
                answer++;
        }

        // 약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
        // 자연수 n이 매개변수로 주어질 때 n 이하의 합성수의 개수를 return
        return answer;
    }

    public static void main(String[] args) {
        int answer1 = new 합성수찾기().solution(10);
        int answer2 = new 합성수찾기().solution(15);

        System.out.println(answer1); // 5
        System.out.println(answer2); // 8
    }
}