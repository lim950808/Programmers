package Lv0;

import java.util.Arrays;

class 중앙값구하기 {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 7, 10, 11};
        int[] arr2 = new int[]{9, -1, 0};

        int answer1 = new 중앙값구하기().solution(arr1);
        int answer2 = new 중앙값구하기().solution(arr2);

        System.out.println(answer1); // 7
        System.out.println(answer2); // 0
    }
}