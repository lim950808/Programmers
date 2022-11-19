package Lv0;

import java.util.Arrays;

class 배열두배만들기 {
    public int[] solution(int[] numbers) {
        int[] answer = new int [numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers1 = new int[]{1, 2, 3, 4, 5};
        int[] numbers2 = new int[]{1, 2, 100, -99, 1, 2, 3};

        int[] answer1 = new 배열두배만들기().solution(numbers1);
        int[] answer2 = new 배열두배만들기().solution(numbers2);

        System.out.println(Arrays.toString(answer1)); // [2, 4, 6, 8, 10]
        System.out.println(Arrays.toString(answer2)); // [2, 4, 200, -198, 2, 4, 6]
    }
}