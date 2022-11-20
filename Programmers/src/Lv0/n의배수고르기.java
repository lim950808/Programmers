package Lv0;

import java.util.Arrays;

class n의배수고르기 {
    public int[] solution(int n, int[] numList) {
        // filter를 이용해 배열 중 0으로 나눠지는 것들만 stream으로 하나씩 출력
        return Arrays.stream(numList).filter(num -> num % n == 0).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] arr2 = new int[]{1, 9, 3, 10, 13, 5};
        int[] arr3 = new int[]{2, 100, 120, 600, 12, 12};

        int[] answer1 = new n의배수고르기().solution(3, arr1);
        int[] answer2 = new n의배수고르기().solution(5, arr2);
        int[] answer3 = new n의배수고르기().solution(12, arr3);

        System.out.println(Arrays.toString(answer1)); // [6, 9, 12]
        System.out.println(Arrays.toString(answer2)); // [10, 5]
        System.out.println(Arrays.toString(answer3)); // [120, 600, 12, 12]
    }
}