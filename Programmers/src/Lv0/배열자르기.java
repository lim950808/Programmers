package Lv0;

import java.util.Arrays;

class 배열자르기 {
    public int[] solution(int[] numbers, int num1, int num2) {
        // Arrays.copyOfRange(원본 배열, 복사할 시작 인덱스, 복사할 끝 인덱스)
        // 인덱스는 0부터 시작하는 것 기준이므로 num2에는 1을 더해줌
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 3, 5};

        int[] answer1 = new 배열자르기().solution(arr1, 1, 3);
        int[] answer2 = new 배열자르기().solution(arr2, 1, 2);

        System.out.println(Arrays.toString(answer1)); // [2, 3, 4]
        System.out.println(Arrays.toString(answer2)); // [3, 5]
    }
}