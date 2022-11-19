package Lv0;

import java.util.Arrays;

class 짝수는싫어요 {
    public int[] solution(int n) {
        int[] answer;
        if (n % 2 == 0)
            answer = new int[n / 2];
        else
            answer = new int[n / 2 + 1];

        int m = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                answer[m] = i;
                m++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] answer1 = new 짝수는싫어요().solution(10);
        int[] answer2 = new 짝수는싫어요().solution(15);

        System.out.println(Arrays.toString(answer1)); // [1, 3, 5, 7, 9]
        System.out.println(Arrays.toString(answer2)); // [1, 3, 5, 7, 9, 11, 13, 15]
    }
}