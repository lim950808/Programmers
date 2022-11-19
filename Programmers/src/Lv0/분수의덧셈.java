package Lv0;

import java.util.Arrays;

class 분수의덧셈 {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        answer[0] = denum1 * num2 + denum2 * num1;
        answer[1] = num1 * num2;

        int min = Math.min(answer[0], answer[1]);
        int max = 1;

        for (int i = 1; i <= min; i++) {
            if (answer[0] % i == 0 && answer[1] % i == 0) {
                max = i;
            }
        }

        answer[0] /= max;
        answer[1] /= max;
        return answer;
    }

    public static void main(String[] args) {
        int[] answer1 = new 분수의덧셈().solution(1,2,3,4);
        int[] answer2 = new 분수의덧셈().solution(9,2,1,3);

        System.out.println(Arrays.toString(answer1)); // [5, 4]
        System.out.println(Arrays.toString(answer2)); // [29, 6]
    }
}