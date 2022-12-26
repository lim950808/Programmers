package Lv0;

import java.util.Arrays;

class 최댓값만들기1 {
    public int solution(int[] numbers) {
        // 오름차순으로 배열 numbers 정렬
        Arrays.sort(numbers);

        // numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return
        // 정렬한 배열의 마지막에서 두번째 숫자와 마지막 숫자의 곱
        return numbers[numbers.length - 2] * numbers[numbers.length - 1];
    }

    public static void main(String[] args) {
        int[] numbers1 = new int[]{1, 2, 3, 4, 5};
        int[] numbers2 = new int[]{0, 31, 24, 10, 1, 9};

        int answer1 = new 최댓값만들기1().solution(numbers1);
        int answer2 = new 최댓값만들기1().solution(numbers2);

        System.out.println(answer1); // 20
        System.out.println(answer2); // 744
    }
}